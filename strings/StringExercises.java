package strings;

public class StringExercises {
    

    


    public static void main(String[] args) {

        // different ways creating a string
        String str1 = "this is a litteral string";
        String str2 = new String("This is a string by \'new\' keyword");

        // extract a string using substring

        String str3 = "javascript is fun";
        str3.substring(0, 4); // output: java

        // Searching in string using indexof()
        int result = str3.indexOf('s'); // result == 4

        // Matching a string against a regular expression with matches()
        "Java".matches("^J..a$"); // output: True

        // Comparing strings using the method equals()
        str1.equals(str2); // output: false

        // equalsIgnoreCase(), startsWith(), endsWith(), and compareTo()

        String str4 = "THis is A LitteRal STRinG";
        String str5 = "this is a litteral string";

        str1.equalsIgnoreCase(str4); // output: TRUE

        str3.startsWith("java"); // output: TRUE

        str3.endsWith("n"); // TRUE
        str3.endsWith("fun"); // TRUE
        str3.endsWith("Fun"); // FALSE

        str1.compareTo(str5); // return 0 as the 2 strinfs are equal
        str1.compareTo(str3); // return a positive value as str3 come before str1 in the dictionary order

        // Trimming strings with trim()
        String str6 = "   Learn Java Programming      ";

        System.out.println(str6.trim()); // output: "Learn Java Programming"

        // Replacing characters in strings with replace()
        String str7 = "bat ball";
        System.out.println(str7.replace('b', 'c')); // output: cat call. Replace b with c

        // Splitting strings with split()
        String[] results = str1.split(" "); // output: {"this", "is", "a", "litteral", "string"}

        // Converting numbers to Strings with valueOf()
        int a = 5;
        long l = -2343834L;
        float f = 23.4f;
    
        System.out.println(String.valueOf(a));  // "5"
        System.out.println(String.valueOf(l));  // "-2343834"
        System.out.println(String.valueOf(f));  // "23.4"

        // Converting integer objects to strings
        Integer nb = 8;
        nb.toString();

        System.out.println(str2);
    }
    
}
