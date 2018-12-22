public class ProcessScheduler {
    LinkedListQueue<Process> processes;
    Process currentProcess;
    public ProcessScheduler()
    {
        processes=new LinkedListQueue<Process>();
                currentProcess=null;
    }
    public Process getCurrentProcess()
    {
        return currentProcess;
    }
    public void addProcess(Process a)
    {
        if(currentProcess==null)
            currentProcess=a;
        else
            processes.enqueue(a);
    }
    public void runNextProcess()
    {
        currentProcess=processes.dequeue();
    }
    public void cancelCurrentProcess()
    {
        currentProcess=processes.dequeue();
    }
    public void printProcessQueue()
    {
        processes.print();
    }
}
