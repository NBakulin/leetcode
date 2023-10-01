package solutions.solution_456;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean find132pattern(int[] nums) {
        List<int[]> intervalsList = new ArrayList<>();
        int currentMinimum = Integer.MAX_VALUE;
        int previousMaximum = Integer.MAX_VALUE;
        int currentMaximum = Integer.MIN_VALUE;

        for (int newNumber : nums) {

            if (currentMinimum < currentMaximum) {
                if (currentMinimum >= newNumber) {
                    if (previousMaximum <= currentMaximum) {
                        intervalsList = new ArrayList<>();
                    }
                    intervalsList.add(new int[]{currentMinimum, currentMaximum});
                    previousMaximum = currentMaximum;
                    currentMinimum = newNumber;
                    currentMaximum = Integer.MIN_VALUE;
                    continue;
                }

                if (newNumber < currentMaximum) return true;
            }

            if (currentMinimum > newNumber) {
                currentMinimum = newNumber;
                continue;
            }

            if (currentMaximum < newNumber) currentMaximum = newNumber;

            if (intervalsList.isEmpty() == false) {
                for (int i = intervalsList.size() - 1; i >= 0; i--) {
                    int[] interval = intervalsList.get(i);
                    if (interval[0] >= newNumber) {
                        break;
                    }
                    if (interval[1] > newNumber) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
