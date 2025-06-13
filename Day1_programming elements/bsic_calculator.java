import java.util.*;
public class bsic_calculator {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        b = scanner.nextDouble();
        double addition = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;
        System.out.println("the addition,subtraction,multiplication and division of these two numbers is : " +addition+ "," +subtraction+"," +multiplication+"," +division);

        
    
    }
}
