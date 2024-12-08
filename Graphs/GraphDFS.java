package Graphs;
import java.util.*;
public class GraphDFS {
    private List<List<Integer>> adjecList;
    private int vertices;

    GraphDFS(int vertices) {
        this.vertices = vertices;
        adjecList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjecList.add(new ArrayList<>());
        }
    }
    
    public void addEdges(int source, int destination) {
        adjecList.get(source).add(destination);
        adjecList.get(destination).add(source);
    }

    public void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

          // Visit all unvisited neighbors
          for (int neighbor : adjecList.get(vertex)) {
              if (!visited[neighbor]) {
                  dfs(neighbor, visited); // Recurse on the unvisited neighbor
              }
          }
    }
     public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6); // Create a graph with 6 vertices (0 to 5)

        // Add edges
        graph.addEdges(0, 1);
        graph.addEdges(0, 2);
        graph.addEdges(1, 3);
        graph.addEdges(1, 4);
        graph.addEdges(2, 5);

        // Create a visited array to track visited vertices
        boolean[] visited = new boolean[graph.vertices];

        System.out.println("DFS Traversal starting from vertex 0:");
        graph.dfs(0, visited); // Start DFS from vertex 0
    }
}
