package fr.univ_eiffel.entrainement.revv2exo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main() {
        List<String> votes = List.of(
                "Alice", "Bob", "Alice", "Charlie",
                "Bob", "Alice", "David", "Charlie",
                "Bob", "Alice"
        );
        Map<String,Integer> counted = countVotes(votes);
        System.out.println(counted);
        System.out.println(findWinner(counted));

    }

    public static Map<String, Integer> countVotes(List<String> votes){
        Map<String, Integer> VotePerCandidate = new HashMap<>();
        for (int i = 0; i< votes.size();i++){
            String candidate = votes.get(i);
            if(!VotePerCandidate.containsKey(votes.get(i))){
                VotePerCandidate.put(candidate, 1);
            }else{
                VotePerCandidate.replace(candidate,(VotePerCandidate.get(candidate) + 1));
            }

        }
        return VotePerCandidate;
    }

    public static String findWinner(Map<String, Integer> results) {
        String winner = null;
        int maxVotes = -1;

        for (String candidate : results.keySet()) {
            int votes = results.get(candidate);

            if (votes > maxVotes) {
                winner = candidate;
                maxVotes = votes;
            }
        }

        return winner;
    }


}
