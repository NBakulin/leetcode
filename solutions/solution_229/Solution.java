package solutions.solution_229;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int counter1 = 0, counter2 = 0;
        int candidate1 = 1000000001, candidate2 = 1000000001;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if ((counter1 == 0 || nums[i] == candidate1) && nums[i] != candidate2) {
                counter1++;
                candidate1 = nums[i];
                continue;
            }
            if ((counter2 == 0 || nums[i] == candidate2) && nums[i] != candidate1) {
                counter2++;
                candidate2 = nums[i];
                continue;
            }

            counter1--;
            counter2--;
        }

        counter1 = 0;
        counter2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate1) {
                counter1++;
            }
            if (nums[i] == candidate2) {
                counter2++;
            }
        }

        List<Integer> result = new LinkedList<>();

        if (counter1 > n / 3) {
            result.add(candidate1);
        }
        if (counter2 > n / 3) {
            result.add(candidate2);
        }

        return result;
    }
}
