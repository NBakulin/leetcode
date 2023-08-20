package solutions.solution_239;

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.getLast()]) {
                queue.removeLast();
            }
            queue.addLast(i);
        }
        res.add(nums[queue.getFirst()]);

        for (int i = k; i < nums.length; i++) {
            if (queue.getFirst() == i - k) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && nums[i] >= nums[queue.getLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);
            res.add(nums[queue.getFirst()]);
        }

        return res.stream().mapToInt(i->i).toArray();
    }
}
