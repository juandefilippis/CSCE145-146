
public class IntStackMain {

public static void main(String[] args) {
 
IntStack s = new IntStack();

s.push(4);

s.push(2);

s.push(6);

s.push(7);

System.out.print("Initial Stack is: ");

s.printStack();

System.out.println("Popped: " + s.pop());

System.out.print("Current Stack is: ");

s.printStack();

if(s.canPop()){

System.out.println("can pop an element from stack");

}

else{

System.out.println("can not pop an element from stack");

}

}

}