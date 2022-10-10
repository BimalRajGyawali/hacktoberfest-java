/* Author : G Pala Venki Reddy */

/* Prim's Algorithm for finding Minimum Spanning Tree in Java */

public class PrimAlgorithmAdjacencyMatrix {

    static class Graph{

        /* Number of vertices in the graph */
        int vertices;
        /* Adjacency Matrix */
        int matrix[][];
        /* Constructor */
        public Graph(int vertex) {
            this.vertices = vertex;
            matrix = new int[vertex][vertex];
        }

        public void addEdge(int source, int destination, int weight) {
            //add edge
            matrix[source][destination]=weight;

            //add back edge for undirected graph
            matrix[destination][source] = weight;
        }

        //get the vertex with minimum key which is not included in MST
        int getMinimumVertex(boolean [] mst, int [] key){
            int minKey = Integer.MAX_VALUE;
            int vertex = -1;
            for (int i = 0; i <vertices ; i++) {
                if(mst[i]==false && minKey>key[i]){
                    minKey = key[i];
                    vertex = i;
                }
            }
            return vertex;
        }

        class ResultSet{
            // will store the vertex(parent) from which the current vertex will reached
            int parent;
            // will store the weight for printing the MST weight
            int weight;
        }

        public void primMST(){
            boolean[] mst = new boolean[vertices];
            ResultSet[] resultSet = new ResultSet[vertices];
            int [] key = new int[vertices];

            //Initialize all the keys to infinity and
            //initialize resultSet for all the vertices
            for (int i = 0; i <vertices ; i++) {
                key[i] = Integer.MAX_VALUE;
                resultSet[i] = new ResultSet();
            }

            //start from the vertex 0
            key[0] = 0;
            resultSet[0] = new ResultSet();
            resultSet[0].parent = -1;

            //create MST
            for (int i = 0; i <vertices ; i++) {

                //get the vertex with the minimum key
                int vertex = getMinimumVertex(mst, key);

                //include this vertex in MST
                mst[vertex] = true;

                //iterate through all the adjacent vertices of above vertex and update the keys
                for (int j = 0; j <vertices ; j++) {
                    //check of the edge
                    if(matrix[vertex][j]>0){
                        //check if this vertex 'j' already in mst and
                        //if no then check if key needs an update or not
                        if(mst[j]==false && matrix[vertex][j]<key[j]){
                            //update the key
                            key[j] = matrix[vertex][j];
                            //update the result set
                            resultSet[j].parent = vertex;
                            resultSet[j].weight = key[j];
                        }
                    }
                }
            }
            //print mst
            printMST(resultSet);
        }

        public void printMST(ResultSet[] resultSet){
            int total_min_weight = 0;
            System.out.println("Minimum Spanning Tree: ");
            for (int i = 1; i <vertices ; i++) {
                System.out.println("Edge: " + i + " - " + resultSet[i].parent +
                        " key: " + resultSet[i].weight);
                total_min_weight += resultSet[i].weight;
            }
            System.out.println("Total minimum key: " + total_min_weight);
        }
    }

    /* Driver program to test above functions */

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);
        graph.primMST();
    }
}