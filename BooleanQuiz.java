/**
 * Written by Jun De Filippis
 */
import java.util.Scanner;
public class BooleanQuiz {
 
 
public static void main(String[] args) { 
Scanner kb = new Scanner(System.in);
System.out.println("Welcome to the boolean logic quiz program!");
System.out.println("Enter answer or quit to quit");
String ans = ""; 
while(!ans.equals("quit")) 
{
String boolean1 = "";
String boolean2 = ""; 
int indexof_boolean = (int)(Math.random()*4);
int operation_index = (int)(Math.random()*6);
if (indexof_boolean==0)
{
boolean1 = "true";
boolean2 = "true";
}
else if (indexof_boolean==1)
{boolean1 = "true";
boolean2 = "false";
}
else if (indexof_boolean==2)
{boolean1 = "false";
boolean2 = "true";
}
else if (indexof_boolean==3)
{boolean1 = "false";
boolean2 = "false";
}
 
if (operation_index==0)
{
String operation = "&&";
System.out.println(boolean1+ " "+ operation+" "+ boolean2+ " == ");
ans = kb.nextLine();
Boolean correct = Boolean.parseBoolean(boolean1) && Boolean.parseBoolean(boolean2);
if (!ans.equals("quit")&&!ans.equals(""))
if (Boolean.parseBoolean(ans)== correct)
{
System.out.println("Good Job");
}
else { System.out.println("Wrong Answer");
}
}
if (operation_index==1)
{
String operation = "&";
System.out.println(boolean1+ " "+ operation+" "+ boolean2+ " == ");
ans = kb.nextLine();
Boolean correct = Boolean.parseBoolean(boolean1) & Boolean.parseBoolean(boolean2);
if (!ans.equals("quit")&&!ans.equals(""))
if (Boolean.parseBoolean(ans)== correct)
{
System.out.println("Good Job");
}
else { System.out.println("Wrong Answer");
}
}
if (operation_index==2)
{
String operation = "||";
System.out.println(boolean1+ " "+ operation+" "+ boolean2+ " == ");
ans = kb.nextLine();
Boolean correct = Boolean.parseBoolean(boolean1) || Boolean.parseBoolean(boolean2);
if (!ans.equals("quit")&&!ans.equals(""))
if (Boolean.parseBoolean(ans)== correct)
{
System.out.println("Good Job");
}
else { System.out.println("Wrong Answer");
}
}
if (operation_index==3)
{
String operation = "^";
System.out.println(boolean1+ " "+ operation+" "+ boolean2+ " == ");
ans = kb.nextLine();
Boolean correct = Boolean.parseBoolean(boolean1) ^ Boolean.parseBoolean(boolean2);
if (!ans.equals("quit")&&!ans.equals(""))
if (Boolean.parseBoolean(ans)== correct)
{
System.out.println("Good Job");
}
else { System.out.println("Wrong Answer");
}
}
if (operation_index==4)
{
String operation = "|";
System.out.println(boolean1+ " "+ operation+" "+ boolean2+ " == ");
ans = kb.nextLine();
Boolean correct = Boolean.parseBoolean(boolean1) | Boolean.parseBoolean(boolean2);
if (!ans.equals("quit")&&!ans.equals(""))
if (Boolean.parseBoolean(ans)== correct)
{
System.out.println("Good Job");
}
else { System.out.println("Wrong Answer");
}
}
if (operation_index==5)
{
String operation = "!";
System.out.println(boolean1+ " "+ operation+" "+ boolean2+ " == ");
ans = kb.nextLine();
Boolean correct = ! Boolean.parseBoolean(boolean1);
if (!ans.equals("quit")&&!ans.equals("")){
if (Boolean.parseBoolean(ans)== correct)
{
System.out.println("Good Job");
}
else { System.out.println("Wrong Answer");
 
}
}
}
}
}
}