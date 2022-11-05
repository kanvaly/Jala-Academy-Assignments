package loops;

import java.util.Scanner;

public class PrimeNumber {
    static void isPrime(int number){
        int square = (int) Math.round(Math.sqrt(number));
        int modulo = number%2;
        int i = 3;

        while((modulo != 0) && (i<= square)){
            modulo = number%i;
            ++i;
        }

        if ((modulo == 0) || (number == 0)){
            System.out.println(number + " is not a prime number");
        } else {System.out.println(number + " is a prime number");}


        /*for (int i = 3; i <= square; ++i){
            if (modulo != 0){
                modulo = number%i;
            }else { System.out.println(number + " is not a prime number"); return;}
            ++i;
        }*/

        //if ((number == 2) || (number == 0)){System.out.println(number + " is not a prime number"); return;} // special check for 0 and 2 that are not prime
        
        // System.out.println(number + " is a prime number");
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check it is prime or not");
        try (Scanner in = new Scanner(System.in)) {
            int number = in.nextInt(); // read user input
            isPrime(number); // check number is prime or not
        }
    }
}
