package AnalysisOfAlgorithms;

public class Linear {
    static void linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Branch is : " + arr[i]);
                return;
            }
        }
        System.out.println("Branch is not found");
    }
    public static void main(String[] args) {
        String[] arr = { "ECE", "EEE", "CSE", "IT", "Civil"};
        String target = "CSE";
        linearSearch(arr, target);
    }
}
