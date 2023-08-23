package solutions.solution_767;

import java.util.*;

class Solution {

    public String reorganizeString(String s) {
        Map<Character, Integer> charsToCountMap = new Hashtable<>();

        int stringLength = s.length();

        for (int i = 0; i < s.length(); i++) {
            charsToCountMap.merge(s.charAt(i), 1, Integer::sum);
        }

        for (Character c: charsToCountMap.keySet()) {
            int charsCount = charsToCountMap.get(c);
            if (charsCount > stringLength - charsCount + 1) {
                return "";
            }
        }

        var priorityQueue = new PriorityQueue<int[]>((a, b) -> Integer.compare(b[1], a[1]));
        for (Character c: charsToCountMap.keySet()) {
            priorityQueue.offer(new int[] {c, charsToCountMap.get(c)});
        }

        char prevChar = ' ';
        var stringBuilder = new StringBuilder();

        while (priorityQueue.isEmpty() == false) {
            int[] first = priorityQueue.poll();

            if (prevChar == (char)first[0]) {
                int[] second = priorityQueue.poll();
                prevChar = (char)second[0];
                stringBuilder.append((char)second[0]);

                if (--second[1] > 0) {
                    priorityQueue.offer(second);
                }
                priorityQueue.offer(first);
            } else {
                prevChar = (char)first[0];
                stringBuilder.append((char)first[0]);

                if (--first[1] > 0) {
                    priorityQueue.offer(first);
                }
            }
        }

        return stringBuilder.toString();
    }
}
