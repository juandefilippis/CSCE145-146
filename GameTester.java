//Written by Juan De Filippis
import java.util.*;
public class GameTester  {
    public static void main(String[] args) {

                Random r = new Random();
                Scanner scannner = new Scanner(System.in);
                QueueInterface<Player> queue = new GNQueue<Player>();

                System.out.println("Welcome to the Rock Paper Scissors Tournament");
                System.out.println("We have 10 players. Lets the fun Begin woooooo");
                int playersScores = 0;
                int numberOfPlayers = 10;

                for (int i = 0; i < numberOfPlayers; i++) {
                    queue.enqueue(i);
                    Player players = new Player(String.format("name%d", i));
                }


                for (int i = 0; i < numberOfPlayers; i++) {
                    Player playerO = new Player("name " + i);
                    gameList.insertAtEnd(playerO);
                }

                System.out.println("FIGHT!!!!");

                for (int i = 0; i < numberOfPlayers; i++) {
                    link<Player> a = gameList.get(i);
                    ListNode<Player> tmp = a;
                    ;


                    int gamesPlayed = 0;
                    while (gamesPlayed < numberOfPlayers - 1) {

                        ListNode<Player> b = tmp.getLink();

                        if (a.getPlayer().getName().toLowerCase().equals(b.getPlayer().getName().toLowerCase())) {
                            tmp = b;
                            continue;
                        }

                        if (a.getPlayer().checkPlayed(b.getPlayer())) {
                            continue;
                        }

                        a.getPlayer().getPlayed().add(b.getPlayer().getName());
                        b.getPlayer().getPlayed().add(a.getPlayer().getName());


                        int randNum = r.nextInt(3);
                        int anotherRandNum = r.nextInt(3);
                        a.getPlayer().setHand(randNum);
                        b.getPlayer().setHand(anotherRandNum);

                        System.out.println(a.getPlayer().getName() + " uses " + a.getPlayer().getHand());
                        System.out.println(b.getPlayer().getName() + " uses " + b.getPlayer().getHand());


                        System.out.println(compareHand(a.getPlayer(), b.getPlayer()));

                        tmp = b;

                        gamesPlayed++;
                    }
                }


            }

        }


