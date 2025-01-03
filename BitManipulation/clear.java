package BitManipulation;

public class clear {

    public int clearBit(int number, int position) {
        return number & ~(1 << position);
    }
    public static void main(String[] args) {
        int number = 0b0101;
        int position = 1;
        int result = new clear().clearBit(number, position);
        System.out.println("The bit at position " + position + " in " + number + " is " + result);
    }
}
