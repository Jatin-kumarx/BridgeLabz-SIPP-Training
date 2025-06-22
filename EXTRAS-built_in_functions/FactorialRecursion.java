import java.util.Scanner;
public class FactorialRecursion {
    public static void main(String[] args) {
        int n = getInput();
        System.out.println("Factorial: " + factorial(n));
    }
    static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    static long factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }
}
