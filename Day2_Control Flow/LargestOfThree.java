import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Is first number largest? " + (a > b && a > c));
        System.out.println("Is second number largest? " + (b > a && b > c));
        System.out.println("Is third number largest? " + (c > a && c > b));
    }
}
