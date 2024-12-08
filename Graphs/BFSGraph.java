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
}
