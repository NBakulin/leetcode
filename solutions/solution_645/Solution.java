package solutions.solution_645;

import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] numsCount = new int[nums.length];

        for (int num: nums) numsCount[num - 1]++;

        int[] result = new int[2];
        Arrays.fill(result, -1);

        for (int i = 0; i < numsCount.length; i++) {
            if (result[0] != -1 && result[1] != -1) break;
            if (numsCount[i] > 1) result[0] = i + 1;
            if (numsCount[i] == 0) result[1] = i + 1;
        }

        return result;
    }
}
