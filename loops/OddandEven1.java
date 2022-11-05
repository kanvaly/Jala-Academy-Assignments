// Print odd and even numbers

package loops;

public class OddandEven1 {

    static void oddEven(int number){
        
       if ((number%2)==0){
        System.out.println(number + " is even");
       }
       else{System.out.println(number + " is odd");}

    }

    public static void main(String[] args) {
        oddEven(16708);
    }
}
