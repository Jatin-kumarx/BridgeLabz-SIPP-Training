public class Product<T extends Category> {
    String name;
    double price;
    T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}