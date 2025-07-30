import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> voteMap = new HashMap<>();
        LinkedHashMap<String, Integer> orderMap = new LinkedHashMap<>();

        String[] votes = {"Alice", "Bob", "Alice", "Charlie", "Bob", "Alice"};

        for (String vote : votes) {
            voteMap.put(vote, voteMap.getOrDefault(vote, 0) + 1);
            orderMap.put(vote, voteMap.get(vote));
        }

        System.out.println("Vote counts (unordered): " + voteMap);
        System.out.println("Vote counts (in order): " + orderMap);

        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);
        System.out.println("Sorted results:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}