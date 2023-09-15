package solutions.solution_332;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        // Change to map STRING => WEIGHT
        var priorityQueue = new PriorityQueue<String>((a, b) -> a.compareTo(b));
        var fasf = new PriorityQueue<int[]>((a, b) -> Integer.compare(b[1], a[1]));
    }
}
