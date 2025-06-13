import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        
        System.out.println("Maximum number of handshakes possible among " + 
                           numberOfStudents + " students is: " + handshakes);

        scanner.close();
    }
}

