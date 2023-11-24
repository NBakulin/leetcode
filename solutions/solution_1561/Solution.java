package solutions.solution_1561;

import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int result = 0;
        int n = piles.length;

        for (int i = n / 3; i < n; i += 2) {
            result += piles[i];
        }

        return result;
    }
}
