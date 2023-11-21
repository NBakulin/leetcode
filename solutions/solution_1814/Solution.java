package solutions.solution_1814;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countNicePairs(int[] nums) {
        final int MODULO = (int)1e9 + 7;
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int num: nums) {
            int diff = num - this.rev(num);
            numsMap.put(diff, numsMap.getOrDefault(diff, 0) + 1);
        }

        long answer = 0;
        for (Map.Entry<Integer,Integer> entry: numsMap.entrySet()) {
            int value = entry.getValue();
            answer = (answer + ((long) (value) * (value - 1) / 2)) % MODULO;
        }

        return (int)answer;
    }

    public int rev(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }

        return result;
    }
}
