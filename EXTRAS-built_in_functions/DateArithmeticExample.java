import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);
        LocalDate updated = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = updated.minusWeeks(3);
        System.out.println("Original Date: " + date);
        System.out.println("After additions: " + updated);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
