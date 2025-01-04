package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int limit = 10;
        System.out.println("Powers of two up to 2 ^ " + limit + ":");

        for (int i = 0; i <= limit; i++) {
            int poweroftwo = (int) Math.pow(2, i);
            System.out.println("2 ^ " + i + " = " + poweroftwo);
        }
    }
}
