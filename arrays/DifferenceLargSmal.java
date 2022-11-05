// Write a function to get the difference of largest and smallest value in a array

package arrays;
import java.util.Scanner;

public class DifferenceLargSmal {
    static void difLargSmal(int[] numbers){
        int large,small,i;    
            
        large=small=numbers[0];

        for(i=1;i<numbers.length;++i){
            if(numbers[i]>large)
                large=numbers[i];

            if(numbers[i]<small)
                small=numbers[i];
        }

        System.out.println("The difference of largest and smallest value is: " + (large - small));

    }

    public static void main(String[] args) {
        System.out.println("Enter numbers to get difference of  largest and smallest values\n");

        try (Scanner in = new Scanner(System.in)) {

            String[] entries = in.nextLine().split(" ");

            int[] numbers = new int[entries.length];

            for (int i = 0; i < entries.length; ++i ){
                numbers[i] = Integer.parseInt(entries[i]);
            }

            difLargSmal(numbers);
        }
    }
}
