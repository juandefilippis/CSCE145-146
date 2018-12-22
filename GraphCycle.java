public class GraphCycle

{

    private Stack<Integer> stack;

    private int adjacencyMatrix[][];

    public GraphCycle()

    {

        stack = new Stack<Integer>();

    }

    public void dfs_cycle(int adj_matrix[][], int source)

    {

      int nodes = adj_matrix[source].length - 1;

      adjacencyMatrix = new int[nodes + 1][nodes + 1];

for (int source_vertex = 1; source_vertex <= nodes; source_vertex++)

        {

for (int destinationvertex = 1; destinationvertex <= nodes; destinationvertex++)

            {

      adjacencyMatrix[source_vertex][destinationvertex] =

                 adj_matrix[source_vertex][destinationvertex];

            }

        }

        int seen[] = new int[nodes + 1];        

        int element = source;       

        int destin = source;              

        seen[source] = 1;           

        stack.push(source);

        while (!stack.isEmpty())

        {

            element = stack.peek();

            destin = element;

          while (destin <= nodes)

          {

if (adjacencyMatrix[element][destin] == 1 && seen[destin] == 1)

                {

                    if (stack.contains(destin))

                    {  

System.out.println("The Graph contains cycle");

                    return;   

                    }

                }

if (adjacencyMatrix[element][destin] == 1 && seen[destin] == 0)

                  {

                    stack.push(destin);

                    seen[destin] = 1;

                    adjacencyMatrix[element][destin] = 0;

                    element = destin;

                    destin = 1;

                    continue;

                  }

                destin++;

             }

            stack.pop();

        }  

    }

    public static void main(String...arg)

    {

        int no_of_nodes, sr;

        Scanner scanner = null;

      try

        {

System.out.println("Enter the number of nodes in the graph");

          scanner = new Scanner(System.in);

          no_of_nodes = scanner.nextInt();

int adjacency_matrix[][] = new int[no_of_nodes + 1][no_of_nodes + 1];

          System.out.println("Enter the adjacency matrix");

          for (int i = 1; i <= no_of_nodes; i++)

             for (int j = 1; j <= no_of_nodes; j++)

         adjacency_matrix[i][j] = scanner.nextInt();

// System.out.println("Enter the source for the graph");

            sr = scanner.nextInt();

            GraphCycle checkCycle = new GraphCycle();

            checkCycle.dfs_cycle(adjacency_matrix, sr);

        }catch(InputMismatchException inputMismatch)

        {

            System.out.println("Wrong Input format");

        }

        scanner.close();

    }

}