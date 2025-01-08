package BitManipulation;
//program to swap two numbers
public class Swap {
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping, a = " + a + " and b = " + b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 15;
        swap(a, b);
    }
}