// Write a program to check if two numbers are equal or not

package operators;

public class CheckEquality {
    static void isEqual(int number1, int number2){
        if (number1 == number2){System.out.println(number1 + "equals " + number2);}
        else{System.out.println(number1 + " is different from " + number2);}
    }

    public static void main(String[] args) {
        isEqual(34, 43);
    }
}
