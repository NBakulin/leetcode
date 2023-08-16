package solutions.solution_239;

import java.util.LinkedList;

class Solution {

    public LinkedList<Integer> cacheList = new LinkedList<Integer>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] resultArray = new int[nums.length - k + 1];

        for (int i = 0; i < k; i++) {
            this.cacheList.addLast(nums[i]);
        }
        this.rearrangeList();
        resultArray[0] = this.cacheList.getFirst();

        int counter = 1;
        for (int i = k; i < nums.length; i++) {
            if (this.cacheList.size() >= k) {
                this.cacheList.removeFirst();
                if (this.cacheList.size() > 0) {
                    this.rearrangeList();
                }
            }

            if (this.cacheList.size() > 0 && nums[i] >= this.cacheList.getFirst()) {
                this.cacheList = new LinkedList<Integer>();
                this.cacheList.addLast(nums[i]);
            } else {
                this.cacheList.addLast(nums[i]);
            }

            resultArray[counter++] = this.cacheList.getFirst();
        }

        return resultArray;
    }

    public void rearrangeList()
    {
        int localMax = this.cacheList.stream().max(Integer::compare).get();
        LinkedList<Integer> newCacheList = new LinkedList<Integer>();

        while (this.cacheList.getLast() != localMax) {
            newCacheList.addFirst(this.cacheList.getLast());
            this.cacheList.removeLast();
        }
        newCacheList.addFirst(this.cacheList.getLast());
        this.cacheList = newCacheList;
    }
}
