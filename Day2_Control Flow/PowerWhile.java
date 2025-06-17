import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int exp = sc.nextInt();
        int result = 1, counter = 0;
        while (counter < exp) {
            result *= base;
            counter++;
        }
        System.out.println(base + " raised to the power " + exp + " is: " + result);
    }
}
