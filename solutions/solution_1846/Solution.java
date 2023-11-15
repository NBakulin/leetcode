package solutions.solution_1846;

import java.util.Arrays;

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int previousNumber = 0;
        for (int number: arr) if (number > previousNumber) previousNumber++;
        return previousNumber;
    }
}
