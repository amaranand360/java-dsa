// // import java.util.*;

// // class Edge {
// //     int source, destination, weight;
// //     Edge(int s, int d, int w) {
// //         source = s;
// //         destination = d;
// //         weight = w;
// //     }
// // }

// // public class lab2 {
// //     public static void print(int[] distances) {
// //         System.out.println("Vertex\tDistance from source");
// //         for (int i = 0; i < distances.length; ++i) {
// //             System.out.println(i + "\t\t" + distances[i]);
// //         }
// //     }

// //     public static void bellmanFord(List<Edge> edges, int vertices, int source) {
// //         // Step 1: Initialize distances from source to all vertices as INFINITE
// //         int[] distances = new int[vertices];
// //         Arrays.fill(distances, Integer.MAX_VALUE);
// //         distances[source] = 0;

// //         // Step 2: Relax all edges |vertices| - 1 times
// //         for (int i = 1; i <= vertices - 1; ++i) {
// //             for (Edge e : edges) {
// //                 int u = e.source;
// //                 int v = e.destination;
// //                 int weight = e.weight;
// //                 if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
// //                     distances[v] = distances[u] + weight;
// //                 }
// //             }
// //         }


// //         // Step 4: Print the shortest path from source to all vertices
// //         print(distances);
// //     }

// //     public static void main(String[] args) {
// //         List<Edge> edges = Arrays.asList(
// //             new Edge(0, 1, 5),
// //             new Edge(0, 2, 6),
// //             new Edge(1, 2, -3),
// //             new Edge(2, 3, 8),
// //             new Edge(3, 1, 7)

// //         );
// //         int vertices = 4;
// //         int source = 0;
// //         bellmanFord(edges, vertices, source);
// //     }
// // }

// import java.util.Scanner;
 
// public class BellmanFord
// {
//     private int distances[];
//     private int numberofvertices;
//     public static final int MAX_VALUE = 999;
 
//     public BellmanFord(int numberofvertices)
//     {
//         this.numberofvertices = numberofvertices;
//         distances = new int[numberofvertices + 1];
//     }
 
//     public void BellmanFordEvaluation(int source, int adjacencymatrix[][])
//     {
//         for (int node = 1; node <= numberofvertices; node++)
//         {
//             distances[node] = MAX_VALUE;
//         }
 
//         distances[source] = 0;
//         for (int node = 1; node <= numberofvertices - 1; node++)
//         {
//             for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
//             {
//                 for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
//                 {
//                     if (adjacencymatrix[sourcenode][destinationnode] != MAX_VALUE)
//                     {
//                         if (distances[destinationnode] > distances[sourcenode] + adjacencymatrix[sourcenode][destinationnode])
//                             distances[destinationnode] = distances[sourcenode]+ adjacencymatrix[sourcenode][destinationnode];
//                     }
//                 }
//             }
//         }
 
//         for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
//         {
//             for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
//             {
//                 if (adjacencymatrix[sourcenode][destinationnode] != MAX_VALUE)
//                 {
//                     if (distances[destinationnode] > distances[sourcenode]
//                            + adjacencymatrix[sourcenode][destinationnode])
//                         System.out.println("The Graph contains negative egde cycle");
//                 }
//             }
//         }
 
//         for (int vertex = 1; vertex <= numberofvertices; vertex++)
//         {
//             System.out.println("distance of source  " + source + " to "
//                       + vertex + " is " + distances[vertex]);
//         }
//     }
 
//     public static void main(String... arg)
//     {
//         int numberofvertices = 0;
//         int source;
//         Scanner scanner = new Scanner(System.in);
 
//         System.out.println("Enter the number of vertices");
//         numberofvertices = scanner.nextInt();
 
//         int adjacencymatrix[][] = new int[numberofvertices + 1][numberofvertices + 1];
//         System.out.println("Enter the adjacency matrix");
//         for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
//         {
//             for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
//             {
//                 adjacencymatrix[sourcenode][destinationnode] = scanner.nextInt();
//  	        if (sourcenode == destinationnode)
//                 {
//                     adjacencymatrix[sourcenode][destinationnode] = 0;
//                     continue;
//                 }
//                 if (adjacencymatrix[sourcenode][destinationnode] == 0)
//                 {
//                     adjacencymatrix[sourcenode][destinationnode] = MAX_VALUE;
//                 }
//             }
//         }
 
//         System.out.println("Enter the source vertex");
//         source = scanner.nextInt();
 
//         BellmanFord bellmanford = new BellmanFord(numberofvertices);
//         bellmanford.BellmanFordEvaluation(source, adjacencymatrix);
//         scanner.close();	
//     }
// }

import java.util.Scanner;

public class BellmanFord {
    private int[] dist;
    private int V;
    public static final int INF = 999;

    public BellmanFord(int V) {
        this.V = V;
        dist = new int[V + 1];
    }

    public void bellmanFord(int src, int adj[][]) {
        for (int i = 1; i <= V; i++) {
            dist[i] = INF;
        }

        dist[src] = 0;
        for (int i = 1; i <= V - 1; i++) {
            for (int j = 1; j <= V; j++) {
                for (int k = 1; k <= V; k++) {
                    if (adj[j][k] != INF) {
                        if (dist[k] > dist[j] + adj[j][k])
                            dist[k] = dist[j] + adj[j][k];
                    }
                }
            }
        }

        for (int j = 1; j <= V; j++) {
            for (int k = 1; k <= V; k++) {
                if (adj[j][k] != INF) {
                    if (dist[k] > dist[j] + adj[j][k])
                        System.out.println("Graph contains a negative edge cycle");
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            System.out.println("Distance of source " + src + " to "+ i + " is " + dist[i]);
        }
    }

    public static void main(String... arg) {
        int V = 0;
        int src;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices");
        V = scanner.nextInt();

        int adj[][] = new int[V + 1][V + 1];
        System.out.println("Enter the adjacency matrix");
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= V; j++) {
                adj[i][j] = scanner.nextInt();
                if (i == j) {
                    adj[i][j] = 0;
                    continue;
                }
                if (adj[i][j] == 0) {
                    adj[i][j] = INF;
                }
            }
        }

        System.out.println("Enter the source vertex");
        src = scanner.nextInt();

        BellmanFord bellmanFord = new BellmanFord(V);
        bellmanFord.bellmanFord(src, adj);
        scanner.close();    
    }
}
