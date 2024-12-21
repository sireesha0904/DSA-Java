package Recursion;

public class FibonacciExample {
    static int count = 0;

    public static int fabinEx(int n) {
        count++;
        
        if (n == 0 || n == 1) {
            return n; // base case
        }
        return fabinEx(n - 1) + fabinEx(n - 2); // Recursive relation
    }
    
    public static void main(String[] args) {
        int n = 5;
        count = 0;
        for (int i = 0; i <= n; i++) {
            System.out.print(fabinEx(i) + " ");
        }
        System.out.println();
        System.out.println("Total number of recursive calls: " + count);
        }
    }

