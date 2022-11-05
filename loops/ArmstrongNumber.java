package loops;

import java.util.Scanner;

public class ArmstrongNumber {
    
    static void isAmstrong(int number){
        int dividend = number;
        int sum = 0;

        while(dividend >= 10){ // For number higher or equal to 10
            sum = sum + (int) Math.pow((dividend%10), 3); // sum the cube of each digit until dividend goes down under 10
            dividend = dividend / 10;
        }

        sum = sum + (int) Math.pow((dividend%10), 3); // For number lower than 10, add cube of dividend to sum

        if (sum == number){System.out.println(number + " is an amstrong number");}
        else{System.out.println(number + " is not an amstrong number");}
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check it is amstrong number: \n");

        try (
        Scanner in = new Scanner(System.in)) {
            int number = in.nextInt();

            isAmstrong(number); //call isAmstrong to check if user entry is an amstrong number
        }

    }
}
