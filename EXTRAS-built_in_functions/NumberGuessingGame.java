import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback;
        System.out.println("Think of a number between 1 and 100.");
        while (true) {
            guess = (low + high) / 2;
            System.out.print("Is your number " + guess + "? (high/low/correct): ");
            feedback = sc.nextLine();
            if (feedback.equalsIgnoreCase("high"))
                high = guess - 1;
            else if (feedback.equalsIgnoreCase("low"))
                low = guess + 1;
            else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hurray! The computer guessed it.");
                break;
            } else {
                System.out.println("Invalid input. Type high, low, or correct.");
            }
        }
    }
}
