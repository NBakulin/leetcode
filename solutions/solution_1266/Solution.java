package solutions.solution_1266;

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        int[] prevPoint = points[0];

        for (int i = 1; i < points.length; i++) {
            int[] newPoint = points[i];
            int xDiff = Math.abs(prevPoint[0] - newPoint[0]);
            int yDiff = Math.abs(prevPoint[1] - newPoint[1]);

            result += xDiff + yDiff - Math.min(xDiff, yDiff);
            prevPoint = newPoint;
        }

        return result;
    }
}
