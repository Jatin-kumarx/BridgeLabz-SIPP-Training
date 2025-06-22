import java.util.Scanner;
public class DigitTypeCounter {
    public static void countDigitTypes(int number) {
        int even = 0, odd = 0, zero = 0;
        if (number == 0) {
            zero = 1;
        } else {
            while (number != 0) {
                int digit = number % 10;
                if (digit == 0) zero++;
                else if (digit % 2 == 0) even++;
                else odd++;
                number /= 10;
            }
        }
        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
        System.out.println("Zero digits: " + zero);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        countDigitTypes(num);
    }
}
