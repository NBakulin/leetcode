package solutions.solution_1743;

import java.util.*;

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] pair: adjacentPairs) {
            int first = pair[0];
            int second = pair[1];

            if (map.containsKey(first) == false) map.put(first, (new ArrayList<>()));
            if (map.containsKey(second) == false) map.put(second, (new ArrayList<>()));

            map.get(first).add(second);
            map.get(second).add(first);
        }

        Integer startingPoint = 0;
        for (Map.Entry<Integer, List<Integer>> entry: map.entrySet()) {
            if (entry.getValue().size() == 1) {
                startingPoint = entry.getKey();
                break;
            }
        }

        int[] ans = new int[map.size()];
        ans[0] = startingPoint;
        int i = 1;
        int prev = Integer.MAX_VALUE;

        while (i < map.size()) {
            for (int neighbor : map.get(startingPoint)) {
                if (neighbor != prev) {
                    ans[i] = neighbor;
                    i++;
                    prev = startingPoint;
                    startingPoint = neighbor;
                    break;
                }
            }
        }

        return ans;
    }
}
