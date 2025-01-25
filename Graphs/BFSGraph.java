//BFS implementation code
package Graphs;
import java.util.*;

class BFSGraph {
    private List<List<Integer>> adjeList;
    private int vertices;

    BFSGraph(int vertices) {
        this.vertices = vertices;
        adjeList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjeList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjeList.get(source).add(destination); //Add destination to the source`s list
        adjeList.get(destination).add(source); // Add source to the destination`s list
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices]; // To track the visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Queue of vertices to visit

        visited[startVertex] = true; // mark this vertex as visited
        queue.add(startVertex); // Add the starting vertex to the queue
        System.out.println("Breadth-First Search: ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjeList.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
     }
    public static void main(String[] args) {
        BFSGraph grap = new BFSGraph(6);
         
    grap.addEdge(0, 1);
    grap.addEdge(0, 2);
    grap.addEdge(1, 3);
    grap.addEdge(1, 4);
    grap.addEdge(2, 5);

    grap.bfs(0);
    }
}


