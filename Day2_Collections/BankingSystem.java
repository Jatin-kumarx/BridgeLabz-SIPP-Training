import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Double> accounts = new HashMap<>();
        accounts.put("A001", 5000.0);
        accounts.put("A002", 10000.0);
        accounts.put("A003", 3000.0);

        System.out.println("Customer accounts: " + accounts);

        TreeMap<Double, String> balanceSort = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            balanceSort.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Customers sorted by balance:");
        for (Map.Entry<Double, String> entry : balanceSort.entrySet()) {
            System.out.println(entry.getValue() + ": " + entry.getKey());
        }

        Queue<String> withdrawalQueue = new LinkedList<>();
        withdrawalQueue.add("A002");
        withdrawalQueue.add("A001");

        while (!withdrawalQueue.isEmpty()) {
            String acc = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for: " + acc);
        }
    }
}