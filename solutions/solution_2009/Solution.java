package solutions.solution_2009;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    int[] uniqueNumbers;
    public int minOperations(int[] nums) {
        Set<Integer> numbersSet = new HashSet<>();
        for (int number: nums) {
            numbersSet.add(number);
        }
        int initialLength = nums.length;

        this.uniqueNumbers = new int[numbersSet.size()];
        int index = 0;
        for (Integer number: numbersSet) {
            this.uniqueNumbers[index++] = number;
        }
        Arrays.sort(this.uniqueNumbers);

        int result = initialLength;
        for (int i = 0; i < uniqueNumbers.length; i++) {
            int target = uniqueNumbers[i] + initialLength - 1;
            int rightIndex = binarySearch(target);
            result = Math.min(initialLength - rightIndex + i, result);
        }

        return result;
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = this.uniqueNumbers.length;

        while (left < right) {
            int mid = (right + left) / 2;
            if (this.uniqueNumbers[mid] > target) right = mid;
            else left = mid + 1;
        }

        return left;
    }
}