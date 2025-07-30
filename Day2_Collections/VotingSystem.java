
import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> voteMap = new HashMap<>();
        LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
        voteMap.put("Alice", 3);
        voteMap.put("Bob", 5);
        voteMap.put("Charlie", 2);

        voteOrder.put("Alice", 3);
        voteOrder.put("Bob", 5);
        voteOrder.put("Charlie", 2);

        TreeMap<String, Integer> sortedVotes = new TreeMap<>(voteMap);

        System.out.println("Vote Count (HashMap): " + voteMap);
        System.out.println("Vote Order (LinkedHashMap): " + voteOrder);
        System.out.println("Sorted Votes (TreeMap): " + sortedVotes);
    }
}
