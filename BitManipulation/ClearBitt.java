package BitManipulation;

public class ClearBitt {

    public static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }
    public static void main(String[] args) {
        int number = 0b0101;
        int position = 2;
        int result = clearBit(number, position);
        System.out.println("Number before clearing the bit: " + Integer.toBinaryString(number));
        System.out.println("Number after clearing the bit: " + Integer.toBinaryString(result));
    }
}
