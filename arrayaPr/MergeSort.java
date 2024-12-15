package arrayaPr;
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {

        //STEP-1: Base condition (stop splitting if the array has 1 or 0 elements)
        if (array.length < 2) {
            return; // base condition
        }
        
        // Step 2: Split the array into two halves
        int mid = array.length / 2;  // Find the middle index
        int[] left = Arrays.copyOfRange(array, 0, mid); // Copy the left half 
        int[] right = Arrays.copyOfRange(array, mid, array.length); // Copy the right half

        mergeSort(left);
        mergeSort(right);
    }
    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Original Array:" + Arrays.toString(array));
        System.out.println("Sorted Array:" + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted Array:" + Arrays.toString(array));
    }
}
