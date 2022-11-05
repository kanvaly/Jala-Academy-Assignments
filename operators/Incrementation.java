// Write  a method for increment and decrement operators (++, --)

package operators;

public class Incrementation {
    static void incrementor(int number){
        int result = number;
        System.out.println("After incrementation of " + result + ": " + ++result);
    }

    static void decrementor(int number){
        int result = number;
        System.out.println("After decrementation of " + result + ": " + --result);
    }

    public static void main(String[] args) {
        incrementor(78);
        decrementor(78);
    }
}
