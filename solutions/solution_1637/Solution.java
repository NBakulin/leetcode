package solutions.solution_1637;

import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xArray = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xArray[i] = points[i][0];
        };

        Arrays.sort(xArray);

        int maxDiff = 0;
        for (int i = 1; i < xArray.length; i++) {
            int diff = xArray[i] - xArray[i - 1];
            if (maxDiff < diff) {
                maxDiff = diff;
            }
        }

        return maxDiff;
    }
}
