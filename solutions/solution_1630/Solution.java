package solutions.solution_1630;

import java.util.*;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            result.add(isArithmetic(Arrays.copyOfRange(nums, l[i], r[i] + 1)));
        }

        return result;
    }

    public Boolean isArithmetic(int[] arr) {
        Arrays.sort(arr);
        int prevNumber = arr[0];
        int diff = arr[1] - arr[0];

        for (int j = 1; j < arr.length; j++) {
            int newNumber = arr[j];
            if (newNumber - prevNumber != diff) {
                return false;
            }
            prevNumber = newNumber;
        }

        return true;
    }
}
