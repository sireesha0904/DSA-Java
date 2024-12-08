// Program to create and print an Adjacency List 
package Graphs;
import java.util.ArrayList;
import java.util.List;

class GraphAdjList {
    private List<List<Integer>> adjList; // Adjacency List
    private int vertices;

    // Constructor
    public GraphAdjList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);

        // Initialize each vertex's list
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>()); // Add an empty list for each vertex
        }
    }

    // Method to add an edge
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination); // Add destination to source's list
        adjList.get(destination).add(source); // Add source to destination's list (for undirected graph)
    }

    // Method to print the adjacency list
    public void printAdjList() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList(4); // Create a graph with 4 vertices (0 to 3)

        // Add edges
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);

        // Print the adjacency list
        System.out.println("Adjacency List:");
        graph.printAdjList();
    }
}
