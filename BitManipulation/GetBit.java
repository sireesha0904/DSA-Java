package BitManipulation;

public class GetBit {
    
    public static int getBit(int number, int position) {
        return (number >> position) & 1;
    }
    public static void main(String[] args) {
        int number = 0101;
        int position = 2;
        int result = getBit(number, position);
        System.out.println("The bit at position " + position + " in " + number + " is " + result);
    }
}
