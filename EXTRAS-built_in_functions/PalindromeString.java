import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        String str = getInput();
        if (isPalindrome(str))
            System.out.println("It's a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        return s.equals(rev);
    }
}
