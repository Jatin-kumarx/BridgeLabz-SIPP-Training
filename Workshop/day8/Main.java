package Workshop.day8;

public class Main {
    public static void main(String[] args) {
        User user = new User(
            "Jatin Kumar",
            "Jatin",
            "Kumar",
            "9876543210",
            "jatin@example.com",
            "Pass123",
            21,
            "110001"
        );

        if (user.isValid()) {
            user.displayInfo();
        } else {
            System.out.println("Invalid user details. Please check the fields.");
        }

        Login login = new Login("jatin@example.com", "Pass123");
        System.out.println("Login Email: " + login.getEmail());
    }
}

