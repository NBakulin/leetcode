package solutions.solution_1512;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> numsCountMap = new HashMap<>();
        for (int num: nums) {
            Integer count = numsCountMap.get(num);
            if (count == null) {
                count = 0;
            }
            numsCountMap.put(num, count + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry: numsCountMap.entrySet()) {
            int value = entry.getValue();
            result += value * (value - 1) / 2;
        }

        return result;
    }
}
