import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        HashMap<String, Double> productPrices = new HashMap<>();
        productPrices.put("Apple", 2.0);
        productPrices.put("Banana", 1.0);
        productPrices.put("Mango", 3.0);

        LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Banana", 2);
        cart.put("Apple", 1);
        cart.put("Mango", 3);

        System.out.println("Cart (order of addition): " + cart);

        TreeMap<Double, String> priceSortMap = new TreeMap<>();
        for (String product : cart.keySet()) {
            priceSortMap.put(productPrices.get(product), product);
        }

        System.out.println("Items sorted by price:");
        for (Map.Entry<Double, String> entry : priceSortMap.entrySet()) {
            System.out.println(entry.getValue() + " - $" + entry.getKey());
        }
    }
}