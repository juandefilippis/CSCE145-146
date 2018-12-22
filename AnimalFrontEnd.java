/* Written by Juan De Filippis
*/
import java.util.Scanner; 
public class AnimalFrontEnd { 
 private static Scanner scanner = new Scanner(System.in); 
 
 public static void main(String[] args) {  
  AnimalCollection collection = new AnimalCollection(10);  
  int choice; 
  int animaltype; 
  while (true) {  
   choice = menu(); 
   switch (choice) { 
   case 1: 
    System.out.println("\nWhat would you like to adopt? \n1. House cat \n2. Leopard \n3. Domestic Dog \n4. Wolf"); 
    animaltype = Integer.parseInt(scanner.nextLine()); 
    switch (animaltype) { 
    case 1: 
     HouseCat housecat = getHouseCat(); 
     collection.addAnimal(housecat); 
     break; 
    case 2: 
     Leopard leopard = getLeopard(); 
     collection.addAnimal(leopard); 
     break; 
    case 3: 
     DomesticDog domesticdog = getDomesticDog(); 
     collection.addAnimal(domesticdog); 
     break; 
    case 4: 
     Wolf wolf = getWolf(); 
     collection.addAnimal(wolf); 
     break; 
    default: 
     System.out.println("Invald choice."); 
     break; 
    } 
    System.out.println("\nCurrent Animal Collection:"); 
    collection.printAnimals(); 
    break; 
   case 2:  
    System.out.println("Enter animal to remove.");  
    String key = scanner.nextLine(); 
    collection.removeAnimal(key); 
    collection.printAnimals(); 
    break; 
   case 3: 
    System.out.println("Come back and see us!"); 
    System.exit(0);  
   }  
  } 
 } 
  
 private static Wolf getWolf()  
 {  
   
  String name; 
  double weight; 
  int energyLevel; 
  String pLName; 
  String type;
  System.out.println("\nEnter the wolf's name, weight, energy level and leader name."); 
  System.out.println("Their \"weight\" should be greater than zero."); 
  System.out.println("Their \"energy level\" should be between 1 - 100."); 
  System.out.println("Their \"leader name\" should be exclusive outside of their given name."); 
  name = kb.nextLine(); 
  weight = Double.parseDouble(kb.nextLine()); 
  energyLevel = Integer.parseInt(kb.nextLine()); 
  pLName = kb.nextLine(); 
  type = kb.nextLine();
  return new Wolf(name, weight, energyLevel, pLName, type);  
 } 
 
 private static DomesticDog getDomesticDog() 
 { 
  String name; 
  double weight; 
  int energyLevel; 
  String type; 
  System.out.println("\nEnter the domestic dog's name, weight, energy level and type."); 
  System.out.println("Their \"weight\" should be greater than zero."); 
  System.out.println("Their \"energy level\" should be between 1 - 100."); 
  System.out.println("Their \"type\" should be Retriever, Terrier, Husky, Yappy or Mutt."); 
  name = scanner.nextLine(); 
  weight = Double.parseDouble(scanner.nextLine()); 
  energyLevel = Integer.parseInt(scanner.nextLine()); 
  type = scanner.nextLine(); 
  return new DomesticDog(name, weight, energyLevel, type); 
 } 
 
 private static Leopard getLeopard() 
 {  
  String name; 
  double weight; 
  String mood; 
  int numberOfSpots; 
  System.out.println("\nEnter the leopard's name, weight, mood and number of spots."); 
  System.out.println("Their \"weight\" should be greater than zero."); 
  System.out.println("Their \"mood\" should be sleepy, playful or hungry."); 
  System.out.println("Their \"number of spots\" should be greater than one."); 
  name = scanner.nextLine(); 
  weight = Double.parseDouble(scanner.nextLine()); 
  mood = scanner.nextLine(); 
  numberOfSpots = Integer.parseInt(scanner.nextLine()); 
  return new Leopard(name, weight, mood, numberOfSpots);  
 } 
 
 private static HouseCat getHouseCat() 
 {  
  String name; 
  double weight; 
  String mood; 
  String type; 
  System.out.println("\nEnter the house cat's name, weight, mood and type."); 
  System.out.println("Their \"weight\" should be greater than zero."); 
  System.out.println("Their \"mood\" should be sleepy, playful or hungry."); 
  System.out.println("Their \"type\" should be Short Hair, Bombay, Ragdoll, Sphinx or Scottish Fold."); 
  name = scanner.nextLine(); 
  weight = Double.parseDouble(scanner.nextLine()); 
  mood = scanner.nextLine(); 
  type = scanner.nextLine(); 
  return new HouseCat(name, weight, mood, type); 
 } 
 
 public static int menu() 
 {  
  System.out.println("\nWelcome to the pet adoption kiosk!"); 
  System.out.println("What would you like to do?"); 
  System.out.println("\n1. Adopt a cat or dog"); 
  System.out.println("2. Remove a cat or dog"); 
  System.out.println("3. Quit"); 
  int choice = Integer.parseInt(scanner.nextLine()); 
  return choice; 
 } 
}