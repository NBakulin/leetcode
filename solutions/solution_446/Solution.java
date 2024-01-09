//package solutions.solution_446;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> dp = new HashMap<>();

        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            int iNum = nums[i];
            for (int j = i + 1; j < n - 1; j++) {
                int jNum = nums[j];
                int diff = iNum - jNum;

                Integer prevNumber = null;

                for (int k = j + 1; k < n; k++) {
                    int kNum = nums[k];

                    if (prevNumber != null && prevNumber - kNum == diff) {
                        dp.put(diff, dp.getOrDefault(diff, 0) + 1);
                    }

                    if (jNum - kNum == diff) {
                        prevNumber = kNum;
                        dp.put(diff, dp.getOrDefault(diff, 0) + 1);
                    }
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry: dp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            result += entry.getValue();
        }

        return result;
    }
}