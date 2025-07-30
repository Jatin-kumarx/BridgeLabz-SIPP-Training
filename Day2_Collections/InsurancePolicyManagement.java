import java.util.*;
import java.time.*;

class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Policy[" + policyNumber + ", " + policyHolder + ", " + expiryDate + "]";
    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        HashMap<String, Policy> policyMap = new HashMap<>();
        LinkedHashMap<String, Policy> insertionOrderMap = new LinkedHashMap<>();
        TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

        Policy p1 = new Policy("P001", "John", LocalDate.now().plusDays(10));
        Policy p2 = new Policy("P002", "Alice", LocalDate.now().plusDays(40));
        Policy p3 = new Policy("P003", "John", LocalDate.now().plusDays(5));
        Policy p4 = new Policy("P004", "Bob", LocalDate.now().minusDays(2));

        for (Policy p : Arrays.asList(p1, p2, p3, p4)) {
            policyMap.put(p.policyNumber, p);
            insertionOrderMap.put(p.policyNumber, p);
            expiryMap.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
        }

        System.out.println("Retrieve by policy number (P002): " + policyMap.get("P002"));

        System.out.println("\nPolicies expiring within 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        expiryMap.subMap(today, true, threshold, true).values().forEach(System.out::println);

        System.out.println("\nPolicies for John:");
        for (Policy p : policyMap.values()) {
            if (p.policyHolder.equals("John")) System.out.println(p);
        }

        System.out.println("\nRemoving expired policies...");
        policyMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        policyMap.values().forEach(System.out::println);
    }
}