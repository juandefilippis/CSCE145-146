//Written by Juan De Filippis 
import java.util.*;
public class  ContainedWords{

    public static boolean check(String aName1, String aName2,int i, int j) {
        if (i == 0) 
          return true;
        if (j == 0) 
        return false;
        if (aName1.charAt(i - 1) == aName2.charAt(j - 1))
        {
            return check(aName1, aName2, i - 1, aName2.length());
        }
           else{
            return check(aName1, aName2, i, j -1);
           }
    }

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 2 words. I will determine if the letters of one is contained in the other");
        String aName1 = kb.nextLine();
        String aName2 = kb.nextLine();
        int i = aName1.length();
        int j = aName2.length();
        boolean checkString = check(aName1, aName2, i, j);
        if (checkString) {
            System.out.println("They are contained!");

        } 
        else {
            System.out.println("They are not contained oh my god");
        }



    }
}