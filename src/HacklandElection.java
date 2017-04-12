import java.util.*;

/**
 * Created by Lenovo on 06-04-2017.
 */
public class HacklandElection {

    public static void main(String args[]) {

        final String[] candidates = new String[]{"Alex", "Michael",
                "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"};

        final String electionWinner = electionWinner(candidates);

        if (electionWinner.equals("Michael")) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
    

    }

    private static String electionWinner(String[] candidates) {

        final Map<String, Integer> candidateVotes = new HashMap<>();
        int maxVotes = 0;

        for (final String candidate : candidates) {
            if (candidateVotes.get(candidate) == null) {
                candidateVotes.put(candidate, 1);
            } else {
                final int votes = candidateVotes.get(candidate) + 1;
                if (votes > maxVotes) {
                    maxVotes = votes;
                }
                candidateVotes.put(candidate, votes);
            }
        }

        final SortedSet<String> sortedCandidates = new TreeSet<>();

        for (final Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {

            if (entry.getValue() == maxVotes) {
                sortedCandidates.add(entry.getKey());
            }
        }

        return sortedCandidates.last();
    }
}
