//Written by Juan De Filippis
import java.util.Scanner;
import java.util.Random;
public class Minesweeper {
  
    enum Space {Mine,Empty};
    public static final int BOARD_SIZE = 10;
    public static final int Mines = ((BOARD_SIZE*BOARD_SIZE)/BOARD_SIZE);
  public static void main(String[] args) { 
    
    //Board settings 
    Space [][] board = new Space[BOARD_SIZE][BOARD_SIZE];
     for(int y=0;y<board.length;y++)
    {
        for(int x=0;x<board[y].length;x++)
        {
            board[y][x] = Space.Empty;
        }
    }
     // Placing mines randomly 
     Random a = new Random ();
     int mines = (int)(Mines);
     while (mines >0)
     {
       int tX= a.nextInt(BOARD_SIZE);
       int tY= a.nextInt(BOARD_SIZE);
       if (board[tY][tX] == Space.Empty)
       {
         board [tY][tX] = Space.Mine;
         mines--;
       }
     }
     System.out.println("Creating empty board");
       
        for (int y = 0; y < board.length ; y++ ) 
        {
            for (int x = 0; x < board[y].length ; x++ )
            {
                switch(board[y][x])
                {
                case Empty:
                    System.out.print("_");
                    break;
                    default:
                    System.out.print("_");
                    break;
                  case Mine:
                System.out.print("_");
                break;
                }
            }
            System.out.println();
        }
         System.out.println("Placing mines");
       
        for (int y = 0; y < board.length ; y++ ) 
        {
            for (int x = 0; x < board[y].length ; x++ )
            {
                switch(board[y][x])
                {
                case Empty:
                    System.out.print("_");
                    break;
                    default:
                    System.out.print("_");
                    break;
                  case Mine:
                System.out.print("x");
                break;
                }
            }
            System.out.println();
        }
        System.out.println("Performing mine count");
       
        for (int y = 0; y < board.length ; y++ ) 
        {
            for (int x = 0; x < board[y].length ; x++ )
            {
              int count = 0;
              if (x > 0 && board [y][x-1] == Space.Mine)
              {
                count++;
              }
              if(x < 9 && board[y][x+1] == Space.Mine)
              {
                count++;
              }
              if (y > 0 && board [y-1][x]==Space.Mine)
              {
                count++;
              }
              if (y < 9 && board [y+1][x]== Space.Mine)
              {
                count++;
              }
              if(y> 0 && x >0 && board[y-1][x-1] == Space.Mine)
              {
                count++;
              }
              if(y<9 && x<9 && board [y+1][x+1] == Space.Mine)
              {
                count++;
              }
              if (y>0 && x<9 && board [y-1][x+1] == Space.Mine)
              {
                count++;
              }
               if (y<9 && x>0 && board [y+1][x-1] == Space.Mine)
               {
                 count++;
               }
              
                switch(board[y][x])
                {
                case Empty:
                    System.out.print(count);
                    break;
                    default:
                    System.out.print("?");
                    break;
                  case Mine:
                System.out.print("x");
                break;
                }
            }
            System.out.println();
        }
    }
}
    
