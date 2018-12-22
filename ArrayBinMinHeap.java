//Written by Juan De Filippis
public class ArrayBinMinHeap <T extends Comparable <T>> {

    private T[] heap;
    public static final int DEFAULT_SIZE =10;
    private int lastIndex;//first null value

    public ArrayBinMinHeap()
    {
        init(DEFAULT_SIZE);
    }
    public ArrayBinMinHeap(int size)
    {
        init(size);
    }
    private void init(int size)
    {
        if(size >0 )
            heap=(T[])(new Comparable[size]);
            lastIndex=0;
    }
    public void insert(T aData)
    {
        if(lastIndex>= heap.length)//heap is full
            return;
        heap[lastIndex]=aData;
        bubbleUp();
        lastIndex++;
    }
    private void bubbleUp()
    {
        //keeps track of the index of the newly inserted item
        int currIndex= lastIndex;
        while (currIndex > 0 &&
                heap[(currIndex-1)/2].compareTo(heap[currIndex])>0)
        {
            //SWAP
            T temp= heap[(currIndex-1)/2];
            heap[(currIndex-1)/2]=heap[currIndex];
            heap[currIndex]=temp;
            currIndex =(currIndex-1)/2;
        }
    }
    public T peek ()
    {
        if(heap==null)
            return null;
        return heap[0];
    }
    public T remove()
    {
      if (heap == null) {
          return null;
      }
        T retVal = heap[0];
        if(lastIndex-1!=-1){
        heap[0] = heap[lastIndex - 1];
        heap[lastIndex - 1] = null;
        lastIndex--;
    }
        bubbleDown();
        return retVal;
    }

        private void bubbleDown()
        {
            int currIndex=0;
            while(currIndex*2+1<lastIndex)
            {
                int bigIndex=currIndex*2+1;//Assumes the left child is the largest
                if(currIndex*2+2<lastIndex&&
                        heap[currIndex*2+1].compareTo(heap[currIndex*2+2])>0)
                    bigIndex=currIndex*2+2;
                if(heap[currIndex].compareTo(heap[bigIndex])>0)
                {
                    //Swap
                    T temp =heap[currIndex];
                    heap[currIndex]=heap[bigIndex];
                    heap[bigIndex]=temp;
                }
                else
                    break;
                currIndex=bigIndex;
            }
    }
        @SuppressWarnings("unchecked")
    public void heapSort()
    {
        Comparable[]heap2= new Comparable [heap.length];
        for(int i=0;i<heap2.length;i++){
          heap2[i] = heap[i];
        }
        for(int i =0;i<heap2.length;i++){
        System.out.println(this.remove());

    }
        for(int i=0;i<heap2.length;i++)
        {
          this.insert((T)heap2[i]);
        
        }
        }
    public void print()
    {
      for(int i=0;i<heap.length;i++)
        if(heap[i] !=null){
        System.out.println(heap[i]);
      }

}
}

