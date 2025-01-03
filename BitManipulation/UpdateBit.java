package BitManipulation;
//combinaion of set and clear bit
public class UpdateBit {
    public static int setBit(int number, int position) {
        return number | (1 << position);
    }

    public static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    public static int updateBit(int number, int position, int value) {
        if (value == 0) {
            return clearBit(number, position);
        } else {
            return setBit(number, position);
        }
    }

    public static void main(String[] args) {
        int number = 0b0101;
        int position = 1;
        int value = 1;
        int result = updateBit(number, position, value);
         System.out.println("Number before updating the bit: " + Integer.toBinaryString(number));
        System.out.println("Number after updating the bit: " + Integer.toBinaryString(result));
    }
}
