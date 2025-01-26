package AnalysisOfAlgorithms;
// Program for O(1) analysis
public class ConstTime {
    public static void main(String[] args) {
        CheckEvenOdd(5);
    }
    
    static void CheckEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }

}
