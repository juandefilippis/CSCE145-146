/**
 * Written by Juan De Filippis
 */
import java.util.Scanner;
public class CSCEhomework1 {
  
  
  public static void main(String[] args) { 
   System.out.println("Welcome to the Information Scanner2700. We are collecting basic data for research purposes and none of this information will be sold or used with out your permission.");
   
   System.out.println("What is your name?");
   Scanner keyboard = new Scanner(System.in);
   String name = keyboard.nextLine();
   
   System.out.println("Greetings "+name+", How old are you");
   int age = keyboard.nextInt();
   
   System.out.println("Intresting, How tall are you in meters?");
   double height = keyboard.nextDouble();
 
  keyboard.nextLine();
   
   System.out.println("Alright, what is your bloodtype?");
   String bloodtype = keyboard.nextLine();
   
   System.out.println("You are a cat person. True or False?");
   boolean catperson = keyboard.nextBoolean();
   
   System.out.println("You are a dog person. True or False?");
   boolean dogperson = keyboard.nextBoolean();
   
   System.out.println("You are a shape shifting reptilian. True or False?");
   boolean shapeShiftingReptilian = keyboard.nextBoolean();
   
   System.out.println("In kilograms, how much gold do you have burried in your backyard?");
   double gold = keyboard.nextDouble();
   
   System.out.println("Name: "+name);
   System.out.println("Age: "+age+ " years old");
   System.out.println("Height: "+height+" Meters");
   System.out.println("Bloodtype: "+bloodtype);
   System.out.println("Cat person: "+catperson);
   System.out.println("Dog person: "+dogperson);
   System.out.println("Shape shifting repilian: "+shapeShiftingReptilian);
   System.out.println("Amount of gold burried in backyard: "+gold+" Kilograms");
  
   
  }
  
  /* ADD YOUR CODE HERE */
  
}

