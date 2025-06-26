public class CartItem {
    String itemName;
    double price;
    int quantity;
    public CartItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added.");
    }
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }
    void displayTotal() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Total Cost: ₹" + total);
    }
    public static void main(String[] args) {
        CartItem item = new CartItem("Shoes", 1200, 2);
        item.addItem(1);
        item.removeItem(1);
        item.displayTotal();
    }
}
