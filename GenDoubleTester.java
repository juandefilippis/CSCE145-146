//Written by Juan De Filippis
public class GenDoubleTester{

    public static void main(String[] args) {

        GenDoubleLinkedList<String> strList = new GenDoubleLinkedList<String>();
        GenDoubleLinkedList<Integer> intList = new GenDoubleLinkedList<Integer>();

        String str = "Jj";

        for(int i=0;i<5;i++)

        {
            strList.insert(str);
            str += "Jj";
            intList.insert(i);
        }
        strList.showList();
        intList.showList();
        intList.goToNext();
        System.out.println();

        intList.goToPrev();
        intList.setCurrent(intList.getCurrent()+40);
        intList.showList();
        intList.insertAfterCurrent(32);
        System.out.println();


        strList.goToPrev();
        strList.showList();
        strList.deleteCurrent();
        System.out.println();

        intList.inList(39);




    }
}





