import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar, Akbar, Anthony: ");
        int age1 = sc.nextInt(), age2 = sc.nextInt(), age3 = sc.nextInt();
        System.out.print("Enter height of Amar, Akbar, Anthony: ");
        int height1 = sc.nextInt(), height2 = sc.nextInt(), height3 = sc.nextInt();

        if (age1 < age2 && age1 < age3)
            System.out.println("Amar is the youngest.");
        else if (age2 < age1 && age2 < age3)
            System.out.println("Akbar is the youngest.");
        else
            System.out.println("Anthony is the youngest.");

        if (height1 > height2 && height1 > height3)
            System.out.println("Amar is the tallest.");
        else if (height2 > height1 && height2 > height3)
            System.out.println("Akbar is the tallest.");
        else
            System.out.println("Anthony is the tallest.");

    }
}
