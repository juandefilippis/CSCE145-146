//Written by Juan De Filippis
public class GenCircularTester {
    public static void main(String[] args)
    {
        GenCircularLinkedList<Integer> intlist = new GenCircularLinkedList<Integer>();
        for(int i=1;i<5;i++)
        {
            intlist.insert(i);
        }
        System.out.println("Circular Linked List Tester");
        System.out.println();
        System.out.println("Create, insert, and print test by adding values 1-4");
        intlist.showList();

        System.out.println();
        System.out.println("Moving current twice and deleting the current");
        intlist.goToNext();
        intlist.goToNext();
        intlist.deleteCurrent();
        intlist.showList();
        System.out.println();
        System.out.println("Testing in list by searching for the value 4");
        intlist.inList(4);
        System.out.println();
        System.out.println("Testing in list by searching for the value 3");
        intlist.inList(3);
        System.out.println();
        System.out.println("Testing getting and setting current by adding the value 10 to the current data");
        intlist.setDataAtCurrent(4+10);
        intlist.getDataAtCurrent();
        intlist.showList();
        System.out.println();
        System.out.println("Moving current foward and deleting that node");
        intlist.goToPrev();
        intlist.goToPrev();
        intlist.deleteCurrent();
        intlist.showList();
        System.out.println();
        System.out.println("Moving current backwards and deleting that node");
        intlist.goToNext();
        intlist.deleteCurrent();
        intlist.showList();
        System.out.println();
        System.out.println("Test Done");
    }
}
