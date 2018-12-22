//Written by Juan De Filippis
public class DblStack {
  
  class StackNode{
    public Double data;
    public StackNode next;
 
    public StackNode() {
      data = null;
      next = null;
    }
    
    public StackNode(Double data, StackNode next) { 
      super();
      this.data = data;
      this.next = next;
    }
  }
  
  private StackNode head;
  
  public DblStack() {
    head = null;
  }
  
  public void push(Double val){
    head = new StackNode(val, head);
  }
  
  public Double pop(){
    Double ret = null;
    if(canPop()){
      ret = head.data;
      head = head.next;
    }
    return ret;
  }
  
  public Double peek(){
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
  }
}