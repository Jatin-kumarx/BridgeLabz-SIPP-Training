import java.util.*;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Smartphone", 15000));
        electronicsStorage.addItem(new Electronics("Laptop", 55000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 60));
        groceriesStorage.addItem(new Groceries("Oil", 130));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 1200));
        furnitureStorage.addItem(new Furniture("Table", 3000));

        System.out.println("Electronics:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("Groceries:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("Furniture:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}