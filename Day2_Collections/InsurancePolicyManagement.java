
import java.util.*;

class Policy {
    String policyNumber;
    String holderName;
    Date expiryDate;

    public Policy(String policyNumber, String holderName, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return policyNumber + " - " + holderName + " - " + expiryDate;
    }
}

public class InsurancePolicyManagement {
    static HashMap<String, Policy> policyMap = new HashMap<>();
    static LinkedHashMap<String, Policy> orderedPolicies = new LinkedHashMap<>();
    static TreeMap<Date, List<Policy>> sortedPolicies = new TreeMap<>();

    public static void addPolicy(Policy p) {
        policyMap.put(p.policyNumber, p);
        orderedPolicies.put(p.policyNumber, p);
        sortedPolicies.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
    }

    public static Policy getPolicyByNumber(String number) {
        return policyMap.get(number);
    }

    public static List<Policy> getPoliciesExpiringSoon() {
        List<Policy> result = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        Date now = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date future = cal.getTime();
        for (Date d : sortedPolicies.subMap(now, true, future, true).keySet()) {
            result.addAll(sortedPolicies.get(d));
        }
        return result;
    }

    public static List<Policy> getPoliciesByHolder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.holderName.equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    public static void removeExpired() {
        Date now = new Date();
        List<String> toRemove = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.expiryDate.before(now)) {
                toRemove.add(p.policyNumber);
            }
        }
        for (String key : toRemove) {
            Policy p = policyMap.remove(key);
            orderedPolicies.remove(key);
            sortedPolicies.get(p.expiryDate).remove(p);
        }
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 10);
        addPolicy(new Policy("P101", "Alice", cal.getTime()));
        cal.add(Calendar.DAY_OF_MONTH, 25);
        addPolicy(new Policy("P102", "Bob", cal.getTime()));
        cal.add(Calendar.DAY_OF_MONTH, -50);
        addPolicy(new Policy("P103", "Alice", cal.getTime()));

        System.out.println("All Policies: " + policyMap.values());
        System.out.println("Expiring in 30 days: " + getPoliciesExpiringSoon());
        System.out.println("Policies by Alice: " + getPoliciesByHolder("Alice"));
        removeExpired();
        System.out.println("After Removing Expired: " + policyMap.values());
    }
}
