/*Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 10 = 80*/
public class javaquestion10 {
public static void x1 (int num){

   for(int a = 1; a<= 10;a++){
       System.out.println(num+"*"+a+"="+(num*a));
   }}
    public static void main(String[] args) {
        x1(8);
    }}
