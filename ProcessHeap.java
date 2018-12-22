//Written by Juan De Filippis
public class ProcessHeap  {

    private Process[] heap;
    
    private int size;

    public ProcessHeap(int aSize) {

    if(aSize <=0) return;
    heap =new Process [aSize];
    size=0;
    }



    public void insert(Process data) {
     
      heap[size]=data;
      this.bubbleUp();
      size++;
    }

    private void bubbleUp() {
        //Keeps track of the index of tge newly inserted item
        int tempIndex = this.size;
        while (tempIndex > 0 && heap[(tempIndex - 1) / 2].getPriority () < heap[tempIndex].getPriority()) {
            //SWAP
            Process temp = heap[(tempIndex - 1) / 2];
            heap[(tempIndex - 1) / 2] = heap[tempIndex];
            heap[tempIndex] = temp;
            
            tempIndex = (tempIndex-1)/2;
        }

    }

    public Process peek() {
        if (this.size>0) return heap[0];
        return null;
    }

    public Process remove() {

       Process retVal=heap[0];
       heap[0]=heap[size-1];
       heap[size-1]=null;
       size--;
       this.bubbleDown();
       return retVal;
    }

    private void bubbleDown() {

        int tempIndex = 0;
        while (tempIndex * 2 + 1 < size) {
            int bigIndex = tempIndex * 2 + 1; // Assumes the left child is the largest
            if (tempIndex * 2 + 2 < size && heap[tempIndex * 2 + 1].getPriority()<heap[tempIndex * 2 + 2].getPriority())
                bigIndex = tempIndex * 2 + 2;
            if (heap[tempIndex].getPriority()<heap[bigIndex].getPriority()) {
                //SWAP
                Process temp = heap[tempIndex];
                heap[tempIndex] = heap[bigIndex];
                heap[bigIndex] = temp;
            } else break;
            tempIndex = bigIndex;
        }
    }

    @SuppressWarnings("unchecked")
    public void heapSort() {
        Process[] heap2 = heap.clone();
        for (int i = 0; i < heap2.length; i++) {
            heap2[i] = heap[i];
        }
        for (int i = 0; i < heap2.length; i++) {
            System.out.println(this.remove());

        }
        for (int i = 0; i < heap2.length; i++) {
            this.insert((Process) heap2[i]);
        }
    }

    public void printHeap() {
        for (int i = 0; i <this.size; i++)
        {
                System.out.println(heap[i]);
            }
    }

    public boolean isEmpty() {
        if (this.size == 0)
            return true;
        return false;


    }
}
