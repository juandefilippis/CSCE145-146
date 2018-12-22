/**
 * Written by Juan De Filippis
 */

  import java.util.Scanner;
    
public class ByteConverter 
{
  private static Scanner Kbd = new Scanner (System.in);
    
  public static void main(String[] args) 
  { 
    int numValue = 0;
    System.out.println("Enter an 8 bit binary number and I will convert it to decimal ");
    numValue = Kbd.nextInt();
    
    if (numValue > 250 || numValue < 0)
    {
      System.out.println("Error: Integer is too higgh or too low");
    }
    getBinary(numValue);
  } 
    
    public static void getBinary(int numValue) 
    {
      String s = "";
      for (int j = 0; j < 8; j++)
      {
        if (numValue % 2 == 1)
        {
          s = '1' + s;
        }
        if (numValue % 2 == 0)
        {
          s = '0' + s;
        }
        numValue = numValue/2;
        System.out.println("Binary equivalent is:" + s);
      }
      System.out.println("Binary equivalent is" + s);
      
      }
      
    
  
  
  /* ADD YOUR CODE HERE */
  
}
