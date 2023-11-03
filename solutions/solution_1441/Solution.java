package solutions.solution_1441;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        String push = "Push";
        String pop = "Pop";
        int currentTargetIndex = 0;
        List<String> result = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (currentTargetIndex >= target.length) {
                break;
            }

            result.add(push);
            if (target[currentTargetIndex] == i) {
                currentTargetIndex++;
                continue;
            }

            result.add(pop);
        }

        return result;
    }
}
