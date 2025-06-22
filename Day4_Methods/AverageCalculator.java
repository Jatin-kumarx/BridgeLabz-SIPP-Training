import java.util.Scanner;
public class AverageCalculator {
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) sum += num;
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextDouble();
        }
        double avg = calculateAverage(nums);
        System.out.println("Average = " + avg);
    }
}
