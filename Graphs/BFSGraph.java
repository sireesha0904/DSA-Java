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

}


