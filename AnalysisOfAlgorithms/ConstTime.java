package AnalysisOfAlgorithms;

public class ConstTime {
    public static void main(String[] args) {
        CheckEvenOdd(50);
    }
    
    static void CheckEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }

}
