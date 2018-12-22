/**
 * Written by Juan De Filippis
 * 
 * Second Homework Assignment for CSCE 145.
 */

 import java.util.Scanner;
 
public class CSCEhomework2 {
  
  
  public static void main(String[] args) { 
    
    System.out.println("Enter an 8 bit binary number and I will convert it to decimal");
    Scanner keyboard = new Scanner(System.in);
    String binary = keyboard.nextLine();
    
    String one = binary.substring(0,1);
        String two = binary.substring(1,2);
            String three = binary.substring(2,3);
                String four = binary.substring(3,4);
                    String five = binary.substring(4,5);
                        String six = binary.substring(5,6);
                            String seven = binary.substring(6,7);
                                String eight = binary.substring(7,8);
                        
    int oneB = Integer.parseInt(one);
        int twoB = Integer.parseInt(two);
            int threeB = Integer.parseInt(three);
                int fourB = Integer.parseInt(four);
                    int fiveB = Integer.parseInt(five);
                        int sixB = Integer.parseInt(six);
                            int sevenB = Integer.parseInt(seven);
                                int eightB = Integer.parseInt(eight);
                                
    int decimal = (oneB*128)+(twoB*64)+(threeB*32)+(fourB*16)+(fiveB*8)+(sixB*4)+(sevenB*2)+(eightB);
    
    System.out.println(binary+" in decimal form is "+decimal);
    
  
                                
    

    
   
    
  }
  
  /* ADD YOUR CODE HERE */
  
}