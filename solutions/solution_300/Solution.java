package solutions.solution_300;

import java.util.LinkedList;

class Solution {
    LinkedList<Integer> res;
    public int lengthOfLIS(int[] nums) {
        res = new LinkedList<>();

        for (int num: nums) {
            if (res.isEmpty() || num > res.getLast()) {
                res.add(num);
            }
            else {
                int smallestLargerEqual = binarySearch(num);
                res.set(smallestLargerEqual, num);
            }
        }
        return res.size();
    }

    private int binarySearch(int num) {
        int left = 0, right = res.size() - 1;
        while (left != right) {
            int mid = left + (right - left) / 2;
            if (res.get(mid) < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
