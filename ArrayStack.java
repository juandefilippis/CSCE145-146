//Written by Juan De Filippis
public class ArrayStack <T> implements StackInterface<T> {
    private T[] stack;
    private int head;//this point to the first null element so its one after the head
   public static final int DEFAULT_SIZE=100;


   public ArrayStack()
    {

        init(DEFAULT_SIZE);
    }
public ArrayStack(int aSize)
{

    init(aSize);

}
public void init (int aSize)
{
    if(aSize<=0)
        return;
    head=0;
    stack = (T[])(new Object[aSize]);
}


public void push(T aData)
{
    if(head>=stack.length)//stack is full
        return;
    stack[head]=aData;
    head++;
}
public T pop()
{
    if(head<= 0)//stack is empty
        return null;
    T ret=stack[head-1];
    head--;
    return ret;
}
public T peek()
{
    if(head<=0)
        return null;
    return stack[head-1];
}
public void print()
{
    for(int i=head-1;i>=0;i--)
    {
        System.out.println(stack[i]);
    }

}
public boolean empty()
{
  return head==1;

}

}