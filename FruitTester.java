//Written by Juan De Filippis
import java.io.*;
import java.util.Scanner;

public class FruitTester {

    public static final String name = "\t";

    public static void main(String[] args) {


        BSTreeFruit fruitTree = new BSTreeFruit();
        System.out.println("Welcome to the fruit tree!");
        System.out.println("Populating fruit tree with file...");
        String fileName = "fruit.txt";
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while(fileScanner.hasNextLine())
            {
                String fileLine = fileScanner.nextLine();
                String[] splitString = fileLine.split(name);
                if(splitString.length == 2)
                {
                    String type = splitString[0];
                    double weight = Double.parseDouble(splitString[1]);
                    Fruit fruit1 = new Fruit(type, weight);
                    fruitTree.insert(fruit1);
                }
            }
            fileScanner.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\nPrinting the in-order traversal");
        fruitTree.printInOrder();

        System.out.println("\nPrinting pre-order traversal");
        fruitTree.printPreOrder();

        System.out.println("\nPrinting the post-order traversal");
        fruitTree.printPostOrder();

        System.out.println("\nDeleting Apple 0.4859853412170728");
        Fruit deleteApple = new Fruit("Apple", 0.4859853412170728);
        fruitTree.delete(deleteApple);

        System.out.println("Printing in-order traversal");
        fruitTree.printInOrder();
    }

}