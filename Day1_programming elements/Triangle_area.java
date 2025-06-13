import java.util.*;
public class Triangle_area {
    public static void main(String[] args) {
        double height,base;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        height = sc.nextDouble();
        double area = (base*height)/2;
        System.out.println("The area of the triangle is: "+area);
    }
}
