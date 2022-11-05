// Write a program to print largest number among three numbers

package loops;

import java.util.Scanner;

public class LargestNumber {

    static void largest(double nb1, double nb2, double nb3){
        double higher = nb1;
        if (higher < nb2){higher = nb2;}
        if (higher < nb3){higher = nb3;}
        if ((nb1 == nb2)&&(nb2== nb3)){System.out.println("All three numbers are equal");}
        else{
        System.out.println("The largest among the numbers is: " + higher);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to check the higher one of them");

        try (
        Scanner in = new Scanner(System.in)) {
            double number1 = in.nextDouble(); // read user first number
            double number2 = in.nextDouble(); // read user second nmber
            double number3 = in.nextDouble(); // read user third entered number

            largest(number1, number2, number3); //call largest method to get the higher one from the user entries
        }

        
    }
}
