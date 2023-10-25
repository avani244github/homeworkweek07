/*19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
public class javaquestion19 {
    String a = "Shikha";
    static String b = "Ripti";
    public void selenium (){
        String group1 = "java";
        System.out.println(group1);
        System.out.println(a);
        System.out.println(b);
    }
    public static void Agile(){
        String group2 = "Agile";
        System.out.println(group2);
        javaquestion19 g =new javaquestion19();
        System.out.println(g.a);
        System.out.println(b);}
    public static void main(String[] args) {
        String group3 = "selenium";
        System.out.println(group3);
        javaquestion19 g = new javaquestion19();
        g.selenium();
        Agile();
    }}
