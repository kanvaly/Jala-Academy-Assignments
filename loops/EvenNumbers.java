// Write a program to print even numbers between 10 and 100 using while

package loops;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("These are all even numbers between 10 and 100: \n");

        int i = 10;

        while (i <= 100){
            System.out.println(i);
            i+= 2;
        }
    }
    
}
