//Written by Juan De Filippis
public class OpStack {
  
  class StackNode{
    public String data;
    public StackNode next;
 
    public StackNode() {
      data = null;
      next = null;
    }
    
    public StackNode(String data, StackNode next) { 
      super();
      this.data = data;
      this.next = next;
    }
  }
  
  private StackNode head;
  
  public OpStack() {
    head = null;
  }
  
  public void push(String val)
  {
    head = new StackNode(val, head);
  }
  
  public String pop()
  {
    String ret = null;
    if(canPop()){
      ret = head.data;
      head = head.next;
    }
    return ret;
  }
  
  public String peek(){
    return head.data;
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