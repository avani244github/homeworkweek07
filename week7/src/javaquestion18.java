/*18. Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/
public class javaquestion18 {
    static String a = "Ealing";
    int b = 50;
    public void borough(){
        System.out.println(a);
    }
    public static void address(){
        javaquestion18 s = new javaquestion18();
        System.out.println(s.b);
    }

    public static void main(String[] args) {
        javaquestion18 s = new javaquestion18();
        s.borough();
        address();
    }
}
