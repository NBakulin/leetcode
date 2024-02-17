package solutions.solution_1642;

import java.util.PriorityQueue;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int result = 0;
        int currentHeight = heights[0];
        int nextHeight;
        int n = heights.length;

        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);

        int nextBuildingIndex = 1;
        while (nextBuildingIndex < n) {
            nextHeight = heights[nextBuildingIndex++];
            int diff = nextHeight - currentHeight;
            currentHeight = nextHeight;

            if (diff <= 0) {
                result++;
                continue;
            }

            bricks -= diff;
            queue.offer(diff);

            if (bricks < 0 && !queue.isEmpty() && ladders > 0) {
                ladders--;
                bricks += queue.poll();
            }

            if (bricks < 0) break;
            result++;
        }

        return result;
    }
}
