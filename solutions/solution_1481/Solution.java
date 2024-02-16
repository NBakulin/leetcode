package solutions.solution_1481;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        for (int num: arr) {
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1);
        }
        Queue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));
        for (Map.Entry<Integer, Integer> entry: numsCount.entrySet()) {
            pq.add(new Pair<>(entry.getKey(), entry.getValue()));
        }

        while (k > 0) {
            var pair = pq.peek();
            if (pair.getValue() <= k) {
                k -= pair.getValue();
            } else {
                break;
            }
            pq.poll();
        }

        return pq.size();
    }
}
