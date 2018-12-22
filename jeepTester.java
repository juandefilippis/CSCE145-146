//Written by Juan De Filippis 
import java.util.Scanner;

public class jeepTester {

public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
jeepHeap heap= new jeepHeap();
int input;
boolean run = true;

System.out.println("Enter 1: Add a jeep");
System.out.println("Enter 2: Remove a jeep by Name");
System.out.println("Enter 3: perform jeep roll call");
System.out.println("Enter 4: perform jeep heap sort");
System.out.println("Enter 0: Quit program");

while (run)
{
input = scan.nextInt();

if (input == 0)
run = false;

if (input == 1)
{
System.out.println("Please input the name of jeep");
String name = scan.next();
System.out.println("Please input the weight");
int weight = scan.nextInt();
System.out.println("Please input the horse power");
int horsePower = scan.nextInt();


 Jeep newJeep = new Jeep(name, weight, horsePower);
Jeep.addJeep(newJeep);
}

if (input == 2)
{

System.out.println("the element removed was "+Jeep.removeJeep());
}


}

}
}