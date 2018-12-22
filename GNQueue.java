

//Written by Juan De Filippis



public class GNQueue <T> implements QueueInterface{
    private Player player;

    private class ListNode {
        T data;

        public ListNode getLink() {
            return link;
        }

        ListNode link;
        Player player;

        public ListNode(T aData, ListNode aLink,Player somePlayer) {
            data = aData;
            link = aLink;
            this.player =somePlayer;

        }
    }

    ListNode head;
    ListNode tail;

    public GNQueue()
    {
        head = tail = null;
    }

    public void enqueue(Object aData) {
        ListNode newNode = new ListNode((T) aData, null,null);
        if (head == null) {
            head = newNode;
            tail = head;
            return;
        }
        tail.link = newNode;
        tail = tail.link;
    }

    public Player getPlayer()
    {
        return this.player;
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





