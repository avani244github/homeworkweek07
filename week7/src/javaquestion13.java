/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
public class javaquestion13 {

   static float width = 5.6f;
    static float Height = 8.5f;
    public static void x1 () {

        System.out.println("Area = "+(width * Height));
    }
    public void x2(){
        System.out.println("Perimeter = "+(2*(width + Height)));
    }

    public static void main(String[] args) {
        javaquestion13 r = new javaquestion13();
        x1();
        r.x2();

    }
}
