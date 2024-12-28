package BitManipulation;

public class SetBit {
    public static int setBit(int number, int position) {
        return (number | (1 << position));
    }
    public static void main(String[] args) {
        int number = 0b0101;
        int position = 1;
        int result = setBit(number, position);
        System.out.println("The bit at position " + position + " in " + number + " is " + result);
        System.out.println("In Binary representation of " + result + " is " + Integer.toBinaryString(result) );
    }
}
