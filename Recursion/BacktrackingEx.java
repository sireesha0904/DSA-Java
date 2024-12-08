package Recursion;

public class BacktrackingEx {
    public static void permutation(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //choose a character from the string 
            String newString = str.substring(0, i) + str.substring(i + 1);
            permutation(newString, result + ch) ;
        }
    }
    public static void main(String[] args) {
        String inp = "ABC";
        System.out.println("Permutations of " + inp + ":");
        permutation(inp, " ");
    }
}
