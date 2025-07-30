
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        HashMap<String, Double> productPrices = new HashMap<>();
        LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();

        productPrices.put("Milk", 40.0);
        productPrices.put("Bread", 30.0);
        productPrices.put("Eggs", 60.0);

        cart.put("Milk", 1);
        cart.put("Bread", 2);
        cart.put("Eggs", 1);

        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Cart Items (LinkedHashMap): " + cart);
        System.out.println("Product Prices (HashMap): " + productPrices);
        System.out.println("Sorted by Price (TreeMap): " + sortedByPrice);
    }
}
