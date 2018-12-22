public class IntStack {

class StackNode{

public Integer data;

public StackNode next;

public StackNode() {

data = null;

next = null;

}

public StackNode(Integer data, StackNode next) {

super();

this.data = data;

this.next = next;

}

}

private StackNode head;

public IntStack() {

head = null;

}

public void push(Integer val){

head = new StackNode(val, head);

}

public Integer pop(){

Integer ret = null;

if(canPop()){

ret = head.data;

head = head.next;

}

return ret;

}

public boolean canPop(){

return head != null;

}

public void printStack(){

StackNode temp = head;

while(temp != null){

System.out.print(temp.data + " ");

temp = temp.next;

}

System.out.println();

}

}
