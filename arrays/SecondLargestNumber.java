package arrays;

import java.util.Scanner;

public class SecondLargestNumber {

    static void secondLargest(int [] numbers){
        int first = Integer.MIN_VALUE; 
        int second = Integer.MIN_VALUE;
 
        /* There should be atleast two elements */
        if (numbers.length < 2) {
            System.out.print(" Invalid Input ! There must be at least 2 elements.");
            return;
        }
 
        for (int i = 0; i < numbers.length; i++) {

            /* If current element is greater than
            first then update both first and second */

            if (numbers[i] > first) {
                second = first;
                first = numbers[i];
            }
 
            /* If arr[i] is in between first and
               second then update second  */
            else if (numbers[i] > second && numbers[i] != first)
                second = numbers[i];
        }
 
        if (second == first)
            System.out.print("There is no second largest"
                             + " element\n");
        else
            System.out.print("The second largest element"
                             + " is " + second);

    }

    public static void main(String[] args) {
        System.out.println("Enter numbers to check which one is the second largest\n");

        try (Scanner in = new Scanner(System.in)) {

            String[] entries = in.nextLine().split(" ");

            int[] numbers = new int[entries.length];

            for (int i = 0; i < entries.length; ++i ){
                numbers[i] = Integer.parseInt(entries[i]);
            }

            secondLargest(numbers);
        }

    }
}
