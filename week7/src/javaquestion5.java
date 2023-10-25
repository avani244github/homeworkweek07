/*Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)*/
public class javaquestion5 {

    public void add(int a, int b){
        System.out.println(a+b);}
    public void subtract(int a,int b){
        System.out.println(a-b);
    }
    public static void multiply(int c,int d){
        System.out.println(c*d);
    }
public static void division (int c,int d){
    System.out.println(c/d);
}

    public static void main(String[] args) {
        javaquestion5 x = new javaquestion5();
        x.add(300,20);
        x.subtract(300,20);
        multiply(40,2);
        division(40,2);

    }
}
