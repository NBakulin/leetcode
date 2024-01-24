package solutions.solution_1239;

import java.util.List;

class Solution {
    public int maxLength(List<String> arr) {
        int[] characterOccurrence = new int[26];
        for (String substring: arr) {
            for (char character: substring.toCharArray()) {
                characterOccurrence[character - 'a']++;
            }
        }

        int result = 0;
        for (int occurrence: characterOccurrence) {
            if (occurrence > 0) {
                result++;
            }
        }

        return result;
    }
}
