import java.util.*;
class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    Library(String name) {
        this.name = name;
    }
    void addBook(Book b) {
        books.add(b);
    }
    void showBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John");
        Book b2 = new Book("Data Structures", "Alex");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib2.addBook(b2);
        lib2.addBook(b1);

        lib1.showBooks();
        lib2.showBooks();
    }
}
