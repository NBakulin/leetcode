package solutions.solution_2610;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n + 1];

        List<List<Integer>> result = new ArrayList<>();
        for (int number: nums) {
            counts[number]++;
            if (counts[number] > result.size()) {
                result.add(new ArrayList<>());
            }
            result.get(counts[number] - 1).add(number);
        }

        return result;
    }
}
