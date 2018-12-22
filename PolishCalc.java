//Written by Juan De Filippis
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class PolishCalc{

    static void calculatePostFix(String expression)

    {
        int flag = 0;

        char c = 0;

        Stack<Integer> myStack = new Stack<>();
        for(int i=0;i<expression.length();i++)

        {

            c=expression.charAt(i);

            if(c != ' ')

                if(Character.isDigit(c))

                    myStack.push(c - '0');
            else if (c == '+' || c == '-' || c == '*' || c == '/')
            {

                if(!myStack.empty())
                { 
                    int number1 = myStack.pop();

                    int number2 = myStack.pop();

                    switch(c)
                    
                    {

                        case '+':
                            myStack.push(number2+number1);
                            break;
                            case '-': 
                                
                                myStack.push(number2- number1);

                                break;

                            case '/':

                                try{

                                    myStack.push(number2/number1);

                                }

                                catch(Exception e){

                                    flag = 2;

                                }

                                break;

                            case '*':

                                myStack.push(number2*number1);

                                break;

                        }

                    }

                }

                else{

                    flag = 1;

                    break;

                }

        }

        int result = 0;

        if(flag == 1){

            System.out.println("Exception! For input string: \"" + c + "\"" );

            System.out.println("Result is " + result);

        }

        else if(flag == 2){

            System.out.println("Cannot divide by 0");

            System.out.println("Result is " + result);

        }

        else{

            if(!myStack.isEmpty())

                result = myStack.pop();

            if(myStack.empty())

                System.out.println("Result is " + result);

            else

                System.out.println("Ill formatted expression");

        }

    }

// Driver 

    public static void main(String[] args) throws IOException

    {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the reverse Polish Calculator!");

        System.out.println("Enter in the name of the file");

        String fileName = in.nextLine();

        System.out.println();

        try {

            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {

                String exp = scanner.nextLine();

                System.out.println("Calculating " + exp);

                calculatePostFix(exp);

            }

            scanner.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

    }

}

