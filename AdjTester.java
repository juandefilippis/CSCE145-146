 // Written by Juan De Filippis
public class AdjTester {
    public static void main (String[]args)
    {
        AdjMatrixGraph m = new AdjMatrixGraph(7);
        System.out.println("The Cycles in this graph are");
        m.addEdge(0,5,2);
        m.addEdge(0,3,1);
        m.addEdge(1,3,1);
        m.addEdge(2,0,1);
        m.addEdge(2,4,1);
        m.addEdge(2,5,1);
        m.addEdge(3,2,1);
        m.addEdge(3,4,1);
        m.addEdge(4,5,1);
        m.printAdjMatrix();
        System.out.println("DFS");
        m.printDFS();
        m.printAdjMatrix();
        System.out.println("BFS");
        m.printBFS();
    }
}
