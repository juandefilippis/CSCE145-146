/* 
 * Written by Juan De Filippis
 */ 
import java.util.Random; 
 
public class AlgorithmSorting { 
 private static String algorithms[] = { "Selection Sort", "Bubble Sort", "Merge Sort", "Quick Sort" }; 
 private static int comparisons[] = { 0, 0, 0, 0 }; 
 
 public static void main(String[] args) { 
  final int SIZE = 1000; 
  Random rand = new Random(); 
  int number; 
 
  int[] arrSS = new int[SIZE]; 
  int[] arrBS = new int[SIZE]; 
  int[] arrMS = new int[SIZE]; 
  int[] arrQS = new int[SIZE]; 
 
  for (int i = 0; i < SIZE; i++) { 
   number = rand.nextInt(SIZE); 
   arrSS[i] = number; 
   arrBS[i] = number; 
   arrQS[i] = number; 
   arrMS[i] = number; 
  } 
  for (int i = 0; i < SIZE; i++) 
   System.out.print(arrSS[i] + " "); 
  System.out.println(); 
 
  for (int i = 0; i < SIZE; i++) 
   System.out.print(arrBS[i] + " "); 
  System.out.println(); 
 
  selectionSort(arrSS); 
  bubbleSort(arrBS); 
  mergeSort(arrMS); 
  quickSort(arrQS); 
 
  for (int i = 0; i < SIZE; i++) 
   System.out.print(arrSS[i] + " "); 
  System.out.println(); 
 
  for (int i = 0; i < SIZE; i++) 
   System.out.print(arrBS[i] + " "); 
  System.out.println(); 
 
  System.out.println("\nNumber of values in each array: " + SIZE); 
  System.out.println("\n------------------------------"); 
  System.out.printf("%-15s%15s\n", "Algorithm", "Comparisons"); 
  System.out.println("------------------------------"); 
  for (int i = 0; i < algorithms.length; i++) { 
   System.out.printf("%-15s%15d\n", algorithms[i], comparisons[i]); 
  } 
  System.out.println("------------------------------"); 
 } 
 
 public static void selectionSort(int[] items) { 
  for (int i = 0; i < items.length - 1; i++) { 
   int minPos = i; 
 
   for (int j = i + 1; j < items.length; j++) { 
    comparisons[0] = comparisons[0] + 1; 
    if (items[j] < items[minPos]) { 
     minPos = j; 
    } 
   } 
 
   if (minPos != i) { 
    int temp = items[minPos]; 
    items[minPos] = items[i]; 
    items[i] = temp; 
   } 
  } 
 }  
 
 public static void bubbleSort(int[] items) { 
  boolean flag = true; 
  while (flag) { 
   flag = false; 
   for (int j = 0; j < items.length - 1; j++) { 
    comparisons[1] = comparisons[1] + 1; 
    if (items[j] > items[j + 1]) { 
     int temp = items[j]; 
     items[j] = items[j + 1]; 
     items[j + 1] = temp; 
     flag = true; 
    } 
   } 
  } 
 } 
 
 public static void mergeSort(int[] items) { 
  int n = items.length; 
  int[] temp1 = new int[n / 2]; 
  int[] temp2 = new int[n - temp1.length]; 
 
  if (n > 1) { 
   System.arraycopy(items, 0, temp1, 0, n / 2); 
   System.arraycopy(items, n / 2, temp2, 0, temp2.length); 
   mergeSort(temp1); 
   mergeSort(temp2); 
   merge(temp1, temp2, items); 
  } 
 } 
 
 private static void merge(int[] temp1, int[] temp2, int[] items) { 
  int p = temp1.length; 
  int q = temp2.length; 
  int i = 0; 
  int j = 0; 
  int k = 0; 
 
  while (i < p && j < q) { 
   comparisons[2] = comparisons[2] + 1; 
   if (temp1[i] <= temp2[j]) { 
    items[k] = temp1[i]; 
    i = i + 1; 
   } else { 
    items[k] = temp2[j]; 
    j = j + 1; 
   } 
 
   k = k + 1; 
  } 
 
  if (i == p) 
   System.arraycopy(temp2, j, items, k, q - j); 
  else 
   System.arraycopy(temp1, i, items, k, p - i); 
 } 
 
 public static void quickSort(int[] items) { 
  quickSort(items, 0, items.length - 1); 
 } 
  
 private static void quickSort(int[] items, int l, int r) { 
  int s = partition(items, l, r); 
 
  if (l < s - 1) 
   quickSort(items, l, s - 1); 
  if (s < r) 
   quickSort(items, s, r); 
 } 
  
 private static int partition(int[] items, int l, int r) { 
  int p = l; 
  int q = r; 
  int temp; 
  int pivot; 
  pivot = items[(l + r) / 2]; 
 
  while (p <= q) { 
   comparisons[3] = comparisons[3] + 1; 
   while (items[p] < pivot) 
    p++; 
 
   comparisons[3] = comparisons[3] + 1; 
   while (items[q] > pivot) 
    q--; 
 
   if (p <= q) { 
    temp = items[p]; 
    items[p] = items[q]; 
    items[q] = temp; 
    p++; 
    q--; 
   } 
  } 
  return p; 
 } 
} 
