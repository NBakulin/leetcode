package solutions.solution_2870;

import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);

        int res = 0;
        int currentNum = nums[0];
        int currentNumCount = 0;
        int newRes;
        for (int num: nums) {
            if (currentNum == num) {
                currentNumCount++;
                continue;
            }

            newRes = this.getDivisionsCount(currentNumCount);
            if (newRes <= 0) {
                return -1;
            }
            currentNumCount = 1;
            currentNum = num;

            res += newRes;
        }

        newRes = this.getDivisionsCount(currentNumCount);
        if (newRes <= 0) {
            return -1;
        }
        res += newRes;

        return res;
    }

    public int getDivisionsCount(int num) {
        int result = 0;
        if (num == 1) {
            return -1;
        }

        if (num % 3 == 0) {
            return num / 3;
        }

        result += num / 3;

        if(num % 3 != 0) result++;

        return result;
    }
}
