/**
 * Written by Juan De Filippis
 */
import java.util.Scanner;
public class Homework3 {
  
  
  public static void main(String[] args) { 
    Scanner kb = new Scanner(System.in);
System.out.println("Answer 2-3 questions to figure out what type of iris you've got!");
String Bulb = "";
String Rhizome = "";
System.out.println("Bulb or Rhizome ?:");
String ans = kb.nextLine();
if (ans.equalsIgnoreCase("Bulb") ) {
System.out.print("Bloom in Spring or Summer ?:");
String season = kb.nextLine();
if (season.equalsIgnoreCase("Summer") ){
System.out.print("It's a DUTCH!");
} else { 
System.out.print("It's a RETICULATA!");
}
} else {  
System.out.print("Does it have a Crest? (yes/no):");
String ans2 = kb.nextLine();
if (ans2.equalsIgnoreCase("Yes")) {
System.out.print("It's a CRESTED!");
} else {
System.out.print("Does it have a Beard? (yes/no):");
String ans3 = kb.nextLine();
if (ans3.equalsIgnoreCase("Yes")) {
System.out.print("It's a BEARDED!");
} else {
System.out.print("It's a BEARDLESS!");
}
}

}
}
}

  

