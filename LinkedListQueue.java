public class LinkedListQueue<T> {

    private class ListNode {
        T data;
        ListNode link;

        public ListNode(T aData, ListNode aLink) {
            data = aData;
            link = aLink;
        }
    }
    private ListNode head;
    private ListNode tail;

    public LinkedListQueue()
    {
        head = tail = null;
    }

    public void enqueue(Object aData)
    {
        ListNode newNode = new ListNode((T) aData, null);
        if (head == null)
        {
            head = newNode;
            tail = head;
            return;
        }
        tail.link = newNode;
        tail = tail.link;
    }
    public T dequeue()
    {
        if (head == null)
            return null;
        ListNode ret = head;
        head = head.link;
        return ret.data;

    }
    public T peek()
    {
        if(head==null)
            return null;
        return head.data;
    }

    public void print()

    {
        ListNode temp =head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.link;
        }
    }
}





