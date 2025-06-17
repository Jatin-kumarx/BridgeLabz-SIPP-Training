import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int exp = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + exp + " is: " + result);
    }
}
