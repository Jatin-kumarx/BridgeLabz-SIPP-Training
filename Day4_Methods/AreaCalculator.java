import java.util.Scanner;
public class AreaCalculator {
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + areaOfCircle(r));
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + areaOfRectangle(l, b));
    }
}
