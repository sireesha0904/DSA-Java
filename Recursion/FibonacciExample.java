package Recursion;

public class FibonacciExample {
    public static int fabinEx(int n) {
        if (n == 0 || n == 1) {
            return n; // base case
        }
        return fabinEx(n - 1) + fabinEx(n - 2); // Recursive relation
    }
    
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(fabinEx(i) + " ");
        }
    }
}
