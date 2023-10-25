/*17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/
public class javaquestion17 {
    String city = "London";
    static String country = "United Kingdom";
    public void x1(){
        System.out.println(country);
    }
    public static void x2(){
        javaquestion17 p = new javaquestion17();
        System.out.println(p.city);}

    public static void main(String[] args) {
        javaquestion17 p = new javaquestion17();
        p.x1();
        x2();
    }
}
