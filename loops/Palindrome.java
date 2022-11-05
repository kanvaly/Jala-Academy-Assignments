package loops;

import java.util.Scanner;

public class Palindrome {

    static void isPalindrome(String word){
        int i = 1;
        int l = word.length();
        word= word.toLowerCase();

        while((i<=l/2)&&(word.charAt(i-1)==word.charAt(l-i))){ // compare each letter from the ends towards the middle
            ++i;
        }

        if ((i<=l/2)||(l==1)){ // this means some letters are different or user entried single letter
            System.out.println(word + " is not a palindrome");
        }
        else {System.out.println(word + " is a palindrome");}
    }

    public static void main(String[] args) {
        System.out.println("Enter a word to check it is a palindrome or not");
        try (Scanner in = new Scanner(System.in)){

            String word = in.next();

            isPalindrome(word);

        }
    }
    
}
