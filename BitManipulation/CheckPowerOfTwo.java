package BitManipulation;
public class CheckPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n >0 && (n & (n-1)) == 0;
    }
    
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Checking power of two: " + isPowerOfTwo(n));

        n = 7;
        System.out.println("Checking power of two: " + isPowerOfTwo(n));
    }
}
