//Written by Juan De Filippis
import java.util.*;
public class enclosingSymbolChecker {

    public static void main(String args[]) 
    {
      StackInterface<String> stack = new Stack<String>();
        // it prints out the condition of each character either true or false
        System.out.println(enclosingSymbolChecker("()"));
        System.out.println(enclosingSymbolChecker("<<<>>>"));
        System.out.println(enclosingSymbolChecker("{(tacos)}"));
        System.out.println(enclosingSymbolChecker("if(pass==true){return yay!;}"));
        System.out.println(enclosingSymbolChecker("abcd"));
        System.out.println(enclosingSymbolChecker(""));
        System.out.println(enclosingSymbolChecker(":-)"));
        System.out.println(enclosingSymbolChecker("<3"));
        System.out.println(enclosingSymbolChecker("(<{}>"));
       
    }
// checking that each character has an open version and a closing version
    public static boolean enclosingSymbolChecker(String s) 
    {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if(c == ']' || c == ')' || c == '{'|| c =='<') 
            {     
                stack.push(c);
            } else if(c == '[') {
                if(stack.empty() || stack.pop() != ']') 
                {
                    return false;
                }
            } else if(c == ')') {
                if(stack.empty() || stack.pop() != '(') 
                {
                    return false;
                }           
            } else if(c == '}') 
            {
                if(stack.empty() || stack.pop() != '}') 
                {
                    return false;
                }
                else if(c == '<')
                {
                  if(stack.empty() || stack.pop() !='>')
                       {
                    return false;
            }

                  

                }
            }
        }
        return stack.empty();
    }
    }
        
    

    

