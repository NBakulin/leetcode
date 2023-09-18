package solutions.solution_1337;

import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] weightsArray = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int weight = 0;
            for (int val : mat[i]) {
                weight += val;
            }
            weightsArray[i][0] = weight;
            weightsArray[i][1] = i;
        }

        Arrays.sort(weightsArray, (v1, v2) -> {
            if (v1[0] == v2[0]) {
                return v1[1] - v2[1];
            } else {
                return v1[0] - v2[0];
            }
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = weightsArray[i][1];
        }

        return result;
    }
}
