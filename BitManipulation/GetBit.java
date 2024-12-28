package BitManipulation;

public class GetBit {
    
    public static int getBit(int number, int position) {
        return (number >> position) & 1; //Extract the bit at the given position
    }
    public static void main(String[] args) {
        int number = 0b0101; 
        int position = 1;
        int result = getBit(number, position);
        System.out.println("The bit at position " + position + " in " + number + " is " + result);
    }
}
