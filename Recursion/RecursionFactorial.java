package Recursion;

public class RecursionFactorial {
    
    public static int factorialEx(int n) {
        if (n == 0) { //base case
            return 1;
        }
        return n * factorialEx(n - 1); //Recursion case
    }

    public static void main(String[] args) {
        int num = 6;
        int Result = factorialEx(num);
    System.out.println("Factorial " + num + " is " + Result);
   }
}
