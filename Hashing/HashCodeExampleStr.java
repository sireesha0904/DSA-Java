package Hashing;
public class HashCodeExampleStr {
    public static void main(String[] args) {
        int str = 1509;
        int hashCode = Integer.hashCode(str); // Correct way
        System.out.println(hashCode); // Outputs 1509 (same as the value for integers)
    }
}
