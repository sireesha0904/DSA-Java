package arrayaPr;
public class LargestAndSmallest {
   public static void main(String[] args) {
       int[] numbers = {12, 14,6, 23, 60, 30,8, 100};
       int largest = numbers[0];
       int smallest = numbers[0];

       for(int i = 1; i < numbers.length; i++){

        if(numbers[i] > largest){
            largest = numbers[i];
        }
        if(numbers[i] < smallest){
            smallest = numbers[i];
        }
       }
       System.out.println("The largest number is: " + largest);
       System.out.println("The smallest number is: " + smallest);
   }
}