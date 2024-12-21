package Recursion;

public class FibonacciExample {
    public static int fabinEx(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fabinEx(n - 1) + fabinEx(n - 2);
    }
    
    public static void main(String[] args) {
        int n = 20;
        for (int i = 0; i < n; i++) {
            System.out.print(fabinEx(i) + " ");
        }
    }
}
