//Written by Juan De Filippis
import java.util.*;
public class ShowcaseGame {

    public static void main(String[] args)
    {
 Scanner kb = new Scanner(System.in);
 System.out.println("Welcome to the Showcase Showdown");
 String in="";


 while(!in.equals("no")) {
        System.out.println("Your prizes are:");
        Showcase list = new Showcase();
        System.out.println(list.toString());
        System.out.println("\n" + "You must guess the total of these prizes without going over");
        System.out.print("Your guess:");
        int gu = kb.nextInt();
        kb.nextLine();
        if (gu <= list.getTotal()) {
            System.out.println("Your guess was" + gu + " The actual was" + list.getTotal() + ".You win congratulations!!!");
        } else {
            System.out.println("Your guess was" + gu + "The actual was" + list.getTotal() + "You lose, Sorry :(");

        }
        System.out.println("Would you like to try again? enter no to quit :(");
        in = kb.nextLine().toLowerCase();
    }
    kb.close();
 System.out.println("Bye");
    }
    }
// Is not reading the file. I still can make the file io work at all!!!!!