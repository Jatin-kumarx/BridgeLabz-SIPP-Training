
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<Integer, Double> accounts = new HashMap<>();
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        Queue<Integer> withdrawalQueue = new LinkedList<>();

        accounts.put(101, 5000.0);
        accounts.put(102, 3000.0);
        accounts.put(103, 7000.0);

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        withdrawalQueue.add(102);
        withdrawalQueue.add(101);

        System.out.println("Accounts (HashMap): " + accounts);
        System.out.println("Sorted Accounts by Balance (TreeMap): " + sortedAccounts);
        System.out.println("Withdrawal Queue: " + withdrawalQueue);
    }
}
