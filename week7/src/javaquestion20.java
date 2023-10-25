/*20. Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.*/
public class javaquestion20 {
    static String a = "Spain";
    String b = "United Kingdom";
    public void Homecountry(){
        System.out.println(a);
    }
    public static void Holiday(){
        javaquestion20 f = new javaquestion20();
        System.out.println(f.b);
    }public static void main(String[] args) {
        javaquestion20 f = new javaquestion20();
        f.Homecountry();
        Holiday();

    }


}
