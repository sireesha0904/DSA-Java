package MST;
import java.util.*;

public class KruskalsAlgorithm {
    // Represents an edge between two nodes with a weight
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    
    }
    public static void main(String[] args) {
        
    }
}