/**
 * Written by AJ Gray and Juan De Filippis
 */
import java.util.Scanner;
public class BearNecessitties {
  
  
  public static void main(String[] args) { 
    int salmonprice= 50;
    int combprice= 100;
    int napkinsprice= 20;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the Bear Necessitties Kiosk.");
    System.out.println("Please enter the number of salmon.");
    int numsalmon = keyboard.nextInt();
    int salmoncost = numsalmon* salmonprice;
    System.out.println("Please enter the number of Combs.");
    int numcomb = keyboard.nextInt();
    int combcost = numcomb* combprice;
    System.out.println("Please enter the number of Napkins.");
    int numnapkins = keyboard.nextInt();
    int napkinscost = numnapkins*napkinsprice;
    int area = salmoncost + combcost + napkinscost;
    System.out.println("Total cost in berries:");
    System.out.println(area);
    
    
    
    

    
  }
  
  /* ADD YOUR CODE HERE */
  
}
