package Graphs;
import java.util.*;

public class DijkstraSimple {
    static class Node implements Comparable<Node> {
        int vertices;
        int weight;

        Node(int vertices, int weight) {
            this.vertices = vertices;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return this.weight - other.weight;
        }
    }

}
