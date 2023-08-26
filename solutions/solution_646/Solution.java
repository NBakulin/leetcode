package solutions.solution_646;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Solution {
    public int findLongestChain(int[][] pairs) {
        var priorityQueue = new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[1]));
        var resultList = new LinkedList<int[]>();

        if (pairs.length <= 1) {
            return pairs.length;
        }

        for (int i = 0; i < pairs.length; i++) {
            priorityQueue.offer(pairs[i]);
        }

        while (!priorityQueue.isEmpty()) {
            int[] currentValue = priorityQueue.poll();

            if (!resultList.isEmpty() && resultList.getLast()[1] >= currentValue[0]) {
                continue;
            }

            int[] nextValue = priorityQueue.poll();

            if (nextValue == null) {
                if (resultList.isEmpty()) {
                    resultList.add(currentValue);
                } else if (resultList.getLast()[1] < currentValue[0]) {
                    resultList.add(currentValue);
                }

                break;
            }

            if (nextValue[0] > currentValue[1]) {
                resultList.add(currentValue);
                resultList.add(nextValue);
            } else {
                priorityQueue.offer(currentValue);
            }
        }

        return resultList.size();
    }
}
