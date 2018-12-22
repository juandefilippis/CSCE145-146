/**
 * Written by Juan De Filippis
 */
public class AnimalCollection { 
 private Animal animals[]; 
 private int count; 
 
 public AnimalCollection(int size) { 
  animals = new Animal[size];  
  count = 0; 
 } 
 
 public void addAnimal(Animal animal) { 
  if (count < animals.length) { 
   animals[count] = animal; 
   count++; 
  } 
 } 
 
 public void removeAnimal(String name) { 
  boolean found = false; 
  int pos = -1; 
  for (int i = 0; i < count && !found; i++) { 
   if (animals[i].getname().equals(name)) { 
    found = true; 
    pos = i; 
   } 
  } 
   
  if (found) { 
   for (int i = pos; i < count; i++) { 
    animals[i] = animals[i + 1]; 
   }  
   count--; 
  } 
 } 
 
 public void printAnimals() { 
  for (int i = 0; i < count; i++) { 
   System.out.println(animals[i].toString()); 
  } 
 } 
}
  

