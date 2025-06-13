import java.util.*;
public class distace2_conversion {
    public static void main(String[] args) {
        double distance_feet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet");
        distance_feet = sc.nextDouble();
        double distance_yards = distance_feet/3;
        double distance_miles = distance_yards/1760;
        System.out.println("Distance in yards is " + distance_yards+ "distance in miles is " + distance_miles);
    
    }
}
