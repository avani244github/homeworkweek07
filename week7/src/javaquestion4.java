/*Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

public class javaquestion4 {
static String demo1 = "Morning";
static String demo2 = "Evening";
Double time1 = 9.00;
Double time2 = 5.00;
public void r1(){
    System.out.println(demo1);
    System.out.println(demo2);
    System.out.println(time1);
    System.out.println(time2);
}
public static void r2(){
    javaquestion4 a = new javaquestion4();

    System.out.println(demo1);
    System.out.println(demo2);
    System.out.println(a.time1);
    System.out.println(a.time2);
}

    public static void main(String[] args) {
    javaquestion4 c = new javaquestion4();
    c.r1();
        r2();


    }

}
