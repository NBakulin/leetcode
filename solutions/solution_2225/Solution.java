package solutions.solution_2225;

import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> matchesLost = new HashMap<>();

        for (int[] match: matches) {
            matchesLost.put(match[0], matchesLost.getOrDefault(match[0], 0));
            matchesLost.put(match[1], matchesLost.getOrDefault(match[1], 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> winsOnly = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry: matchesLost.entrySet()) {
            if (entry.getValue() == 0) winsOnly.add(entry.getKey());
            if (entry.getValue() == 1)oneLose.add(entry.getKey());
        }

        Collections.sort(winsOnly);
        Collections.sort(oneLose);

        result.add(winsOnly);
        result.add(oneLose);

        return result;
    }
}
