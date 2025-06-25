public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }

    
    public static void main(String[] args) {
        
        Book book1 = new Book();
        System.out.println("Book 1 (Default Constructor):");
        book1.display();

        System.out.println();


        Book book2 = new Book("Java Basics", "John Doe", 499.99);
        System.out.println("Book 2 (Parameterized Constructor):");
        book2.display();
    }
}
