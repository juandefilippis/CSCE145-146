/**
 * Written by Juan De Filippis
 */
import java.util.Scanner;
public class Lab6 {
  
  
  public static void main(String[] args) { 
    Scanner console = new Scanner(System.in);
    
    final int MINUTE_IN_HOUR = 60;
    final int SECOND_IN_MINUTE = 60;
    int second;
    int minute;
    int hour;
    
    System.out.println("Enter a time in the following format: ''Hours:minutes:seconds'' and I will give you the time in seconds");
    second = console.nextInt();
    
    minute = second / SECOND_IN_MINUTE;
    second = minute * SECOND_IN_MINUTE;
    
    hour = minute / MINUTE_IN_HOUR;
    minute = hour * MINUTE_IN_HOUR;
    
  
  System.out.println("The number of seconds are" = "second");
  }
 }
  
  /* ADD YOUR CODE HERE */
  

