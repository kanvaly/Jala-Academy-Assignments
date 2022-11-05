
// Write a function for arithmetic operators(+,-,*,/)

package operators;

public class Arithmetics {
    static void addition(int number1, int number2){
        int nb1 = number1;
        int nb2 = number2;
        int result = nb1 + nb2;
        System.out.println(nb1 + "+" + nb2 + "=" + result);
    }

    static void substraction(int number1, int number2){
        int nb1 = number1;
        int nb2 = number2;
        int result = nb1 - nb2;
        System.out.println(nb1 + "-" + nb2 + "=" + result);
    }

    static void multiplication(int number1, int number2){
        int nb1 = number1;
        int nb2 = number2;
        int result = nb1 * nb2;
        System.out.println(nb1 + "*" + nb2 + "=" + result);

    }

    static void division(int dividend, int divisor){

        int nb1 = dividend;
        int nb2 = divisor;

        if (nb2 <= 0){System.out.println("Divisor must be higher than zero");}
        else{
            int result = nb1 / nb2;
            System.out.println(nb1 + "/" + nb2 + "=" + result);
        }
    }

    public static void main(String[] args) {
        addition(23, 56);
        substraction(56, 47);
        multiplication(78, 9);
        division(890, 21);
    }
}
