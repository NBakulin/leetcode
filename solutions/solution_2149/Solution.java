package solutions.solution_2149;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int negativePointer = 1;
        int positivePointer = 0;

        for (int num: nums) {
            if (num >= 0) {
                ans[positivePointer] = num;
                positivePointer += 2;
            }
            else {
                ans[negativePointer] = num;
                negativePointer += 2;
            }
        }

        return ans;
    }
}
