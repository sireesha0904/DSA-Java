package Recursion;

public class FibonacciExample {
    static int count = 0; // Static variable to track recursive calls

    public static int fabinEx(int n) {
        count++; // Increment the count for each recursive call

        if (n == 0) {
            return 0; // Base case
        }
        if (n == 1) {
            return 1; // Base case
        }
        return fabinEx(n - 1) + fabinEx(n - 2); // Recursive relation
    }

    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i <= n; i++) {
            count = 0; // Reset count for each Fibonacci number
            int result = fabinEx(i);
            System.out.println("Fib(" + i + ") = " + result + ", Recursive Calls = " + count);
        }
    }
}
