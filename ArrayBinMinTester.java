//Written by Juam De Filippis
public class ArrayBinMinTester {

    public static void main(String[] args) {


        ArrayBinMinHeap<Integer> minHeap = new ArrayBinMinHeap<Integer>();

        System.out.println("Hello world");
        System.out.println("Int Min Heap Tester");
        System.out.println("Populating Heap with values");
        
        minHeap.insert(21);
        System.out.println("21");
        minHeap.insert(37);
        System.out.println("37");
        minHeap.insert(49);
        System.out.println("49");
        minHeap.insert(11);
        System.out.println("11");
        minHeap.insert(23);
        System.out.println("23");
        minHeap.insert(1);
        System.out.println("1");
        minHeap.insert(13);
        System.out.println("13");
        minHeap.insert(16);
        System.out.println("16");
        minHeap.insert(33);
      System.out.println("33");
        minHeap.insert(17);
        System.out.println("17");
        System.out.println("Printing Heap");
        minHeap.print();
        System.out.println("Testing heap Sort lets GO");
        minHeap.heapSort();
        System.out.println("Removing an elemeent from the heap");
        System.out.println("The element removed is 1 and the heap now is:");
        minHeap.remove();
        minHeap.print();
      
        

    }
}
