//Written by Juan De Filippis
//Lab7
import java.util.*;

public class LinearBinarySearch {
   static Random random = new Random();

   public static void main(String[] args) 
   {
       System.out.println("Welcome to the search tester. We are going to see which algorithm performs the best out of 20 tests");
       int totalLinearCount = 0;
       int totalBinaryCount = 0;
       for (int i = 0; i < 20; i++) {
           int[] dataArray = generateRandomArrayWithRandomNum();
           int search = random.nextInt(1000);
           int linearCount = performLinearSearch(dataArray, search);
           int binaryCount = performBinarySearch(dataArray, search);
           System.out.println("Linear Checks: "+linearCount);
           System.out.println("Binary Checks: "+binaryCount);
           totalLinearCount+=linearCount;
           totalBinaryCount+=binaryCount;
       }
       System.out.println("\nThe average number of checks for 20 were:");
       System.out.println("Linear Search "+totalLinearCount/20);
       System.out.println("Binary Search "+totalBinaryCount/20);
   }

   private static int[] generateRandomArrayWithRandomNum() 
   {
       int size = random.nextInt(1000);
       int[] dataArray = new int[size];
       for (int i = 0; i < size; i++) {
           dataArray[i] = random.nextInt(1000);
       }
       Arrays.sort(dataArray);
       return dataArray;
   }

   private static int performLinearSearch(int[] dataArray, int search) 
   {
       System.out.println("Searching using linear search");
       int count = 0;
       boolean found = false;
       for (int i = 0; i < dataArray.length; i++) 
       {
           count++;
           if (dataArray[i] == search)
           {
               found = true;
               break;
           }
       }
       if (found)
       {
           System.out.println("Found!");
       } else {
           System.out.println("Not Found!");
       }
       return count;
   }

   private static int performBinarySearch(int[] dataArray, int search) {
       System.out.println("Searching using binary search");
       int count = 0;
       boolean found = false;
       int high = dataArray.length-1;
       int low = 0;
       int mid = 0;
       while (low <= high) {
   count++;
           mid = (low + high) / 2;
   if (dataArray[mid] > search) {
   high = mid - 1;
   } else if (dataArray[mid] < search) {
   low = mid + 1;
   } else {
       found = true;
       break;
   }
   }
       if(found){
           System.out.println("Found!");
       }else{
           System.out.println("Not Found!");
       }
       return count;
   }
}