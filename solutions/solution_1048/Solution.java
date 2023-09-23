package solutions.solution_1048;

import java.util.*;

public class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (Comparator.comparingInt(String::length)));
        Map<String, Integer> weightsMap = new HashMap<>();
        int maxLength = 1;

        for (String word: words) {
            int newWeight = 0;
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                newWeight = Math.max(newWeight, weightsMap.getOrDefault(sb.toString(), 0) + 1);
            }
            weightsMap.put(word, newWeight);
            maxLength = Math.max(maxLength, newWeight);
        }

        return maxLength;
    }
}
