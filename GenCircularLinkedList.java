//Written by Juan De Filippis
public class GenCircularLinkedList<T> {

    private class ListNode {
        private T data;
        private ListNode link;


        public ListNode()// default constructors
        {
            data = null;
            link = null;

        }

        public ListNode(T aData, ListNode aLink) {
            data = aData;
            link = aLink;

        }
    }
        private ListNode head;// first element
        private ListNode  curr;// current mode of interest
        private ListNode prev;// one behind current
        private ListNode tail;

        public GenCircularLinkedList() // default constructor that starts the head
        {
            head=curr=prev=null;

        }
//methods
    public void goToNext()
    {
        if(curr!=null)
        {
            prev=curr;
            curr=curr.link;
        }
    }
    public void goToPrev()
    {
        if(curr!=head)
        {
            curr=prev;
            prev=prev.link;
        }

    }
    public T getDataAtCurrent()
    {
        if(curr!=null)
            return curr.data;
        else
            return null;


    }
    public void setDataAtCurrent(T aData)
    {
        if(curr!=null)
            curr.data=aData;

    }
    public void insert(T aData)
    {   //creating the node
        ListNode newNode= new ListNode(aData,null);
        if(head == null)//check if this is an empty list
        {
            head=newNode;
            curr=head;
            return;
        }
        //check if List is not empty
        ListNode temp=head;

        while(temp.link!=null)
        {
            temp=temp.link;// adds a new node to the end of the list
        }
        temp.link=newNode;
    }
    public void insertAfterCurrent(T aData)
    {
        ListNode newNode = new ListNode(aData,null);
        if(curr!=null)
        {
            newNode.link=curr.link;
            curr.link=newNode;
        }
        else if(head!=null)
        {
            System.out.println("Current is outside of the list");
        }
        else
            {
                System.out.println("List is empty");

            }

    }
    public void deleteCurrent() {
        if (curr != null && prev != null)// current is somewher in the middel or the end of the list
        {
            prev.link = curr.link;
            curr=curr.link;
        }
        else if (curr!=null&&prev==null)// current is located in the head
        {
            head=head.link;
            curr=head;
        }
        else{
            System.out.println("Current was null.... for some rareeeeeee reason woops");
        }
    }
    public void showList()
    {
        ListNode temp =head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.link;
        }
    }
    public boolean inList(T aData)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.data.equals(aData))
            {
                System.out.println("True");
                return true;
            }
            temp=temp.link;
        }
        System.out.println("FALSE");
        return false;
    }



    }

