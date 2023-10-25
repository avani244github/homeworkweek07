/*Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/

public class javaquestion3 {
    static String name = "kamal";
    String division = "B";
public void l1(){
    System.out.println(name);
    System.out.println(division);}
    public static void l2(){
    javaquestion3 a = new javaquestion3();
    System.out.println(name);
    System.out.println(a.division);}
    public static void main(String[] args) {
    javaquestion3 b = new javaquestion3();
        b.l1();
        l2();}
}
