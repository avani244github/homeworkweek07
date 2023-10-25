package StringHomework;
/*Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/
public class StringQuestion6 {
    public static void main(String[] args) {
        String a= "I@love@java";
       String d = "@";
        String g =  " ";
        String f = "I";
        String h = "we";
        String b= a.replace(d,g);
        String p = b.replace(f,h);
        System.out.println(p);
    }
}
