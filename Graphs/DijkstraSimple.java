package Graphs;

import java.util.*;

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
public class DijkstraSimple {
    
}
