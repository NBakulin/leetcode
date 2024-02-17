package solutions.solution_1642;

import java.util.PriorityQueue;

class Solution2 {
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

            if (bricks >= diff) {
                bricks -= diff;
                queue.offer(diff);
                result++;
                continue;
            }

            if (!queue.isEmpty() && diff < queue.peek() && ladders > 0) {
                ladders--;
                bricks += queue.poll();
            }

            if (bricks >= diff) {
                bricks -= diff;
                queue.offer(diff);
                result++;
                continue;
            }

            if (ladders > 0) {
                ladders--;
                result++;
                continue;
            }

            break;
        }

        return result;
    }
}
