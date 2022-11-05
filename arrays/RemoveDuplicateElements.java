package arrays;

import java.util.Scanner;

public class RemoveDuplicateElements {

    static void removeDuplicate(int[] numbers){

        int temp = 0;

        //Sort the array in ascending order
        
        for (int i = 0; i < numbers.length; ++i) {     
            for (int j = i+1; j < numbers.length; ++j) {     
               if(numbers[i] > numbers[j]) {    
                   temp = numbers[i];    
                   numbers[i] = numbers[j];    
                   numbers[j] = temp;  
               }
            }
        }

        //remove duplicate values

        int[] newArray = new int[numbers.length];

        temp = 0;


        for (int i=0; i< numbers.length-1; ++i){ 

            if (numbers[i] != numbers[i+1]){  
                newArray[temp] = numbers[i];
                ++temp;
            } 
        }

        newArray[temp] = numbers[numbers.length-1];

        //return the new array
        int k = 0;
        System.out.println("New array with no duplicate: ");

        while(k <= temp){
            System.out.print(newArray[k] + " ");
            ++k;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers to get duplicate ones removed\n");

        try (Scanner in = new Scanner(System.in)) {

            String[] entries = in.nextLine().split(" ");

            int[] numbers = new int[entries.length];

            for (int i = 0; i < entries.length; ++i ){
                numbers[i] = Integer.parseInt(entries[i]);
            }

            removeDuplicate(numbers);
        }
    }
}
