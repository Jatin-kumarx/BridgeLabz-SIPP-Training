import java.util.*;
public class height {
    public static void main(String[] args) {
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        height = sc.nextDouble();
        double height_inches = height/2.54;
        double height_feet = height_inches/12;
        System.out.println("Your height in inches " + height_inches + 170 + " Your height in feet is: " + height_feet);


    
    }
}
