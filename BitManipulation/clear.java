package BitManipulation;

public class clear {

    public static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }
    public static void main(String[] args) {
        int number = 0b0101;
        int position = 2;
        int result = clearBit(number, position);
        System.out.println("The bit at position " + position + " in " + number + " is " + result);
    }
}
