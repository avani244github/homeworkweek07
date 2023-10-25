/*Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889*/
public class javaquestion11 {
    static double a= 25.5;
    static double b= 3.5;
    double c= 40.5;
    double d= 4.5;
    public void m1 (){
        System.out.println("Result"+"="+(a*b-b*b)/(c-d));}
    public static void main(String[] args) {
        javaquestion11 k = new javaquestion11();
        k.m1();

    }
}
