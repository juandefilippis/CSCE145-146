//Written by Juan De Filippis
public interface QueueInterface <T>{
    public void enqueue (T aData);
    public T dequeue();
    public T peek();// returns first element without removing it
    public void print();

}
