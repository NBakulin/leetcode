package solutions.solution_1458;

class Solution {
    int[] nums1;
    int[] nums2;

    int maxProductValue = Integer.MIN_VALUE;
    int[][] dp;
    boolean[][] checkedPairs;
    public int maxDotProduct(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        this.dp = new int[nums1.length][nums2.length];
        this.checkedPairs = new boolean[nums1.length][nums2.length];

        int result = this.getMaxDotProduct(0, 0);
        if (result == 0) {
            result += this.maxProductValue;
        }

        return result;
    }

    public int getMaxDotProduct(int i, int j) {
        if (i >= this.nums1.length || j >= this.nums2.length) return 0;
        if (this.checkedPairs[i][j]) return this.dp[i][j];

        int currentProduct = this.nums1[i] * this.nums2[j];
        this.maxProductValue = Math.max(this.maxProductValue, currentProduct);
        currentProduct = Math.max(currentProduct, 0);
        int result = 0;

        result = Math.max(this.getMaxDotProduct(i + 1, j + 1) + currentProduct, result);
        result = Math.max(this.getMaxDotProduct(i + 1, j), result);
        result = Math.max(this.getMaxDotProduct(i, j + 1), result);

        this.checkedPairs[i][j] = true;
        this.dp[i][j] = result;

        return result;
    }
}
