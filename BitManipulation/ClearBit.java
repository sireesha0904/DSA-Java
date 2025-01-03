package BitManipulation;

public class ClearBit {

    public static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    public static void main(String[] args) {
        int number = 0b0101; // Binary representation of 5
        int position = 2;    // Zero-based position to clear
        int result = clearBit(number, position);

        System.out.println("Number before clearing the bit: " + Integer.toBinaryString(number));
        System.out.println("Number after clearing the bit: " + Integer.toBinaryString(result));
    }
}
