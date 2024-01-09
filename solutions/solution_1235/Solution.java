package solutions.solution_1235;

import java.util.Arrays;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Interval[] intervals = new Interval[n];
        int[] dp = new int[n + 1];

        for (int i = 0; i <n ; i++) {
            intervals[i] = new Interval(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(intervals, (a, b) -> {
            return Integer.compare(a.end, b.end);
        });

        for (int i = 0; i < n; i++) {
            Interval currentInterval = intervals[i];
            int nextIndex = binarySearch(intervals, i, currentInterval.start);
            dp[i + 1] = Math.max(dp[i], dp[nextIndex] + currentInterval.profit);
        }

        return dp[n];
    }

    public int binarySearch(Interval[] list, int end, int search) {
        int left = 0;
        int right = end;

        while (left != right) {
            int mid = (left + right) / 2;
            if (list[mid].end <= search) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}

class Interval {
    public Integer start;
    public Integer end;
    public Integer profit;

    public Interval(int start, int end, int profit) {
        this.start = start;
        this.end = end;
        this.profit = profit;
    }
}