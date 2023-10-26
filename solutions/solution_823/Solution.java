package solutions.solution_823;

import java.util.Arrays;

class Solution {
    int[] ways;
    int[] arr;
    int MODULO = (int)1e9 + 7;
    int result = 0;
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        this.arr = arr;
        int n = arr.length;
        this.ways = new int[n];

        result = n;
        for (int i = 1; i < arr.length; i++) {
            this.getPossibleWays(i);
        }

        return this.result;
    }

    public void getPossibleWays(int index) {
        int waysCount = 0;
        for (int i = 0; i < index; i++) {
            int newWaysCount = 0;
            for (int j = i; j < index; j++) {
                if (this.arr[i] * this.arr[j] == this.arr[index]) {
                    newWaysCount = (this.ways[i] + 1) * (this.ways[j] + 1);
                    if (i != j) newWaysCount *= 2;
                }
            }
            waysCount += newWaysCount;
        }

        this.ways[index] = waysCount;

        result = (result + waysCount) % MODULO;
    }
}
