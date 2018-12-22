//Written by Juan De Filippis
public class GenDoubleLinkedList <T> {
    private class ListNode<T> {

        private T data;
        private ListNode<T> nextLink;
        private ListNode<T> prevLink;

        public ListNode() {
            data = null;
            nextLink = null;
            prevLink = null;

        }

        public ListNode(T aData, ListNode<T> aNextLink, ListNode<T> aPrevLink) {

            data = aData;
            nextLink = aNextLink;
            prevLink = aPrevLink;

        }
    }

    private ListNode<T> head;// first element in my linked list
    private ListNode<T> curr;// current mode of interest
    private ListNode<T> prev;// one node behind current


        public GenDoubleLinkedList()// default constructor that initializes the head
        {
            head = curr = prev  = null;

        }

        public void insert(T aData)
        {
            //first step to create the node
            ListNode<T> newNode= new ListNode<T>(aData, null,null);
            if(head==null)//check if this is an empty list
            {
                head=newNode;
                curr=head;
                return;
            }
            //checking if list is not empty
            ListNode<T> temp=head;
            while(temp.nextLink!=null)
            {
                temp= temp.nextLink;
            }
            temp.nextLink=newNode;//adds a new node to the end of the list
        }

        public void goToNext()
        {
            if (curr != null)
            {
                prev = curr;
                curr = curr.nextLink;
            }
        }
        public void goToPrev()
        {
            if(curr!=head)
            {
                curr=prev;
                prev=prev.prevLink;
            }
        }
        public T getCurrent()
        {
            if(curr!=null)
                return curr.data;
            else
                return null;
        }
         public void setCurrent(T aData)
         {
             if(curr!=null)
                 curr.data=aData;
         }
         public void insertAfterCurrent(T aData)
         {
             ListNode<T> newNode = new ListNode<T>(aData,null,null);
             if(curr!=null)
             {
                 newNode.nextLink=curr.nextLink;
                 curr.nextLink=newNode;
             }else if(head!=null)
             {
                 System.out.println("Current is Outside of the List");
             }
             else{
                 System.out.println("List is empty");
             }
         }
         public void deleteCurrent ()
         {
             if(curr!=null&&prev!=null)//current is somewhere in the middle or the end of the list
             {
                 prev.nextLink=curr.nextLink;
                 curr=curr.nextLink;
             }
             else if(curr!=null&&prev==null)//current is located in the head
             {
                 head=curr.nextLink;
                 curr=head;
             }
             else{
                 System.out.println("Current was null.. for some reason wopps");
             }


         }
         public void showList ()
         {
             int i=1;
             ListNode<T> temp =head;
             while(temp!=null)
             {
                 System.out.println(i +" " + temp.data);
                 temp=temp.nextLink;
                 i++;
             }
         }
         public boolean inList(T aData) {
             ListNode <T> temp = head;
             while (temp != null) {
                 if (temp.data.equals(aData)) {
                     System.out.println("True");
                     return true;
                 }
                 temp = temp.nextLink;
             }
             System.out.println("False");
             return false;
         }




    }








