public class Marketplace {
    public static <T extends Category> void applyDiscount(Product<T> p, double percentage) {
        p.price -= p.price * (percentage / 100);
    }
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory());
        applyDiscount(book, 10);
        System.out.println(book.name + " after discount: " + book.price);
    }
}