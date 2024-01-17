package solutions.solution_1207;

import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return (new HashSet<Integer>(map.values())).size() == map.size();
    }
}
