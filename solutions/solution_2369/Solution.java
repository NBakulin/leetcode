package solutions.solution_2369;

import java.util.*;

class Solution {

    public Dictionary<Integer, Boolean> indexesStorage = new Hashtable<>();
    public int[] nums;

    public boolean validPartition(int[] nums) {
        this.nums = nums;
        return this.prefixIsValid(this.nums.length - 1);
    }

    protected boolean prefixIsValid(int i) {
        boolean answer = false;

        if (i < 0 || (this.indexesStorage.get(i) != null && this.indexesStorage.get(i))) {
            return true;
        }

        if (i > 0 && this.nums[i] == this.nums[i - 1]) {
            answer = answer || this.prefixIsValid(i - 2);
        }

        if (i > 1 && this.nums[i] == this.nums[i - 1] && this.nums[i - 1] == this.nums[i - 2]) {
            answer = answer || this.prefixIsValid(i - 3);
        }

        if (i > 1 && this.nums[i] == this.nums[i - 1] + 1 && this.nums[i - 1] == this.nums[i - 2] + 1) {
            answer = answer || this.prefixIsValid(i - 3);
        }

        this.indexesStorage.put((Integer)i, (Boolean)answer);

        return answer;
    }
}