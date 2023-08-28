package solutions.solution_403;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Integer> stonesMap = new HashMap<>();
    Map<String, Boolean> stonesJumpsMap = new HashMap<>();
    int[] stones;

    int endPosition = 0;

    public boolean canCross(int[] stones) {
        if (stones[0] != 0) {
            return false;
        }

        if (stones[1] != 1) {
            return false;
        }

        if (stones.length < 3) {
            return true;
        }

        this.stones = stones;
        for (int stone : stones) {
            this.stonesMap.put(stone, -1);
        }

        this.endPosition = stones[stones.length - 1];

        return this.canJump(stones[1], 1);
    }

    public boolean canJump(int startPosition, int previousJump) {
        if (startPosition == this.endPosition) {
            return true;
        }

        Boolean position1 = this.stonesJumpsMap.get(startPosition + "_" + previousJump);
        if (position1 != null) {
            return position1;
        }

        boolean answer = false;
        int mediumJumpLength = startPosition + previousJump;

        Integer position2 = this.stonesMap.get(mediumJumpLength - 1);
        if (position2 != null && previousJump - 1 > 0) {
            answer = answer | this.canJump(mediumJumpLength - 1, previousJump - 1);
        }

        Integer position3 = this.stonesMap.get(mediumJumpLength);
        if (position3 != null) {
            answer = answer | this.canJump(mediumJumpLength, previousJump);
        }

        Integer position4 = this.stonesMap.get(mediumJumpLength + 1);
        if (position4 != null) {
            answer = answer | this.canJump(mediumJumpLength + 1, previousJump + 1);
        }

        this.stonesJumpsMap.put(startPosition + "_" + previousJump, answer);

        return answer;
    }
}
