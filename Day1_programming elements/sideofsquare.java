import java.util.*;
public class sideofsquare {
    public static void main(String[] args) {
        double parameter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parameter of the square");
        parameter = sc.nextDouble();
        double Side_sqaure = parameter*4;
        System.out.println("The side of the square is " + Side_sqaure);
    }
}
