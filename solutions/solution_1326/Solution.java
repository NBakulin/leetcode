package solutions.solution_1326;

import java.util.*;

class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] currentInterval;
        int[] newPossibleInterval;

        int result = 0;

        List<int[]> rangesList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            rangesList.add(new int[]{i - ranges[i], i + ranges[i]});
        }
        rangesList.sort(Comparator.comparingInt(a -> a[0]));

        currentInterval = newPossibleInterval = rangesList.get(0);
        if (currentInterval[0] > 0) {
            return -1;
        }
        result++;

        for (int[] interval: rangesList) {
            if (0 >= interval[0] && currentInterval[1] <= interval[1]) {
                currentInterval = newPossibleInterval = interval;
                continue;
            }

            if (currentInterval[1] >= interval[0]) {
                if (newPossibleInterval[1] <= interval[1]) {
                    newPossibleInterval = interval;
                    continue;
                }
            } else {
                if (interval[0] > newPossibleInterval[1]) {
                    return -1;
                }
                result++;
                currentInterval = newPossibleInterval;
                newPossibleInterval = interval;
            }

            if (currentInterval[1] >= n) {
                break;
            }
        }

        if (currentInterval[1] < n) {
            result++;
        }

        return result;
    }
}
