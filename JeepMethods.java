public class JeepMethods {

    public class jeepHeap<T extends Comparable<T>> {
        private T[] heap;
        public static final int DEFAULT_SIZE = 120;
        private int lastIndex;//first null value

        public jeepHeap() {
            init(DEFAULT_SIZE);
        }

        public jeepHeap(int size) {
            init(size);
        }

        private void init(int size) {
            if (size > 0) heap = (T[]) (new Comparable[size]);
            lastIndex = 0;
        }

        public void addJeep(T aData) {
            if (lastIndex >= heap.length) return;
            heap[lastIndex] = aData;
            driveUp();
            lastIndex++;
        }

        private void driveUp() {
            int currIndex = lastIndex;// keeps track of the index of the newly addJeeped item
            while (currIndex > 0 && heap[(currIndex - 1) / 2].compareTo(heap[currIndex]) < 0) {
                T temp = heap[(currIndex - 1) / 2];
                heap[(currIndex - 1) / 2] = heap[currIndex];
                heap[currIndex] = temp;
                currIndex = (currIndex - 1) / 2;
            }
        }

        public T peek() {
            if (heap == null) return null;
            return heap[0];

        }

        public T removeJeep() {
            if (heap == null) return null;
            T retVal = heap[0];
            heap[0] = heap[lastIndex - 1];
            heap[lastIndex - 1] = null;
            lastIndex--;
            driveDown();
            return retVal;

        }

        private void driveDown() {
            int currIndex = 0;
            while (currIndex * 2 + 1 < lastIndex) {
                int bigIndex = currIndex * 2 + 1;// assumes left child is the largest
                if (currIndex * 2 + 2 < lastIndex && heap[currIndex * 2 + 1].compareTo(heap[currIndex * 2 + 2]) < 0)
                    bigIndex = currIndex * 2 + 2;
                if (heap[currIndex].compareTo(heap[bigIndex]) < 0) {
                    T temp = heap[currIndex];
                    heap[bigIndex] = temp;

                } else break;
                currIndex = bigIndex;
            }
        }

        public void jeepHeapSort() {
            JeepHeap temp = new LO.JeepHeap();
            temp.LO.JeepHeap = this.lastIndex;
            for (int i = 0; i < heap.length; i++)
                temp.heap[i] = this.heap[i];


            for (int i = 0; i < lastIndex; i++)
                System.out.print(this.removeJeep() + " ");
        }

        public void jeepRollCall() {
            for (int i = 0; i < heap.length; i++) {
                if (heap[i] != null) System.out.println(heap[i]);
            }
        }
    }
}
