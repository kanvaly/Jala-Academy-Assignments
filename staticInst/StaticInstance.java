package staticInst;

public class StaticInstance {
    static int var1, var2; // 2 static variables

    /* 2 static methods */

    static void methd1(){ 

        /* print instance variables in static methods */
        StaticInstance obj = new StaticInstance();
        System.out.println(obj.var3);

        // call instance method in static method
        obj.methd3();
        obj.methd4();
    }

    static void methd2(){ 
        /* print instance variables in static methods */
        StaticInstance obj = new StaticInstance();
        System.out.println(obj.var4);

        // call instance method in static method
        obj.methd3();
        obj.methd4();
    }

    // 2 instance variables
    public int var3, var4;

    
    // 2 instance methods

    public void methd3(){ 

        // Print static variables in instance methods

        System.out.println(var1);
        System.out.println(var2);
     }

    public void methd4(){ 
        // Print static variables in instance methods

        System.out.println(var1);
        System.out.println(var2);
     }

    public static void main(String[] args) {
        
        // Print static variables in main method
        System.out.println(var1);
        System.out.println(var2);

        // Print instance variables in main method
        StaticInstance obj = new StaticInstance();

        System.out.println(obj.var3);
        System.out.println(obj.var4);
        
        // Call instance methods in main method
        obj.methd3();
        obj.methd4();
    }

}
