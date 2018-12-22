//Written by Juan De Filippis
import java.io.*;
import java.util.Scanner;
public class ShapeBSTester {

 static final String FILE = "shapeFile.txt";
 static final String DELIM = "\t";
 public static void main(String[] args) {
  ShapeTree newTree = new ShapeTree();
  System.out.println("Welcome to the shape tree tester!");
  readFromFile(FILE);
  System.out.println();
  System.out.println("Printing pre-order");
  newTree.printPreOrder();
  System.out.println();
  System.out.println("Printing in-order");
  newTree.printInOrder();
  System.out.println();
  System.out.println("Printing post-order");
  newTree.printPostOrder();
  System.out.println();
  
  System.out.println("The max area is: "+ newTree.maxArea());
  System.out.println();
  System.out.println("Deleting ");
  newTree.delete(14.0);
  System.out.println();
  System.out.println("Deleting values higher than 30");
  newTree.delete(30);
  System.out.println("Printing in-order");
  newTree.printInOrder();

 }
 public static void readFromFile(String fileName, ShapeTree tree) {
  try {
   System.out.println("Reading from file");
   Scanner fileScanner = new Scanner(new File(fileName));
   while(fileScanner.hasNextLine()) {
    String fileLine = fileScanner.nextLine();
    String[] splitLines = fileLine.split(DELIM);
    if(splitLines[0].equalsIgnoreCase("rectangle") || splitLines[0].equalsIgnoreCase("right triangle") || splitLines[0].equalsIgnoreCase("circle")) {
     if(splitLines.length == 3) {
      if(splitLines[0].contains("rectangle")) {
       Rectangle r = new Rectangle(Double.parseDouble(splitLines[1]), Double.parseDouble(splitLines[2]));
       tree.insert(r);
       System.out.println(fileLine);
      }
      else {
       RightTriangle rT = new RightTriangle(Double.parseDouble(splitLines[1]), Double.parseDouble(splitLines[2]));
       tree.insert(rT);
       System.out.println(fileLine);
      }
     }
     else {
      Circle c = new Circle(Double.parseDouble(splitLines[1]));
      tree.insert(c);
      System.out.println(fileLine);

     }
    }
    else {
     System.out.println("Error, improper input");
    }
   }
   fileScanner.close();
  }
  catch(FileNotFoundException e) {
   e.getMessage();
  }
 }
}