package solutions.solution_1930;

import java.util.Arrays;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int[][] firstAndLastOccurrences = new int[2][26];
        boolean[] traversableChars = new boolean[26];
        Arrays.fill(firstAndLastOccurrences[0], -1);
        Arrays.fill(firstAndLastOccurrences[1], -1);

        for (int i = 0; i < s.length(); i++) {
            int character = s.charAt(i) - 'a';
            if (firstAndLastOccurrences[0][character] < 0) {
                firstAndLastOccurrences[0][character] = i;
            } else {
                firstAndLastOccurrences[1][character] = i;
                traversableChars[character] = true;
            }
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (traversableChars[i] == false) {
                continue;
            }
            boolean[] usedChars = new boolean[26];
            int usedCount = 0;
            for (int j = firstAndLastOccurrences[0][i] + 1; j < firstAndLastOccurrences[1][i]; j++) {
                int character = s.charAt(j) - 'a';

                if (usedChars[character] == false) {
                    result++;
                    usedChars[character] = true;
                    usedCount++;
                }

                if (usedCount == 26) {
                    break;
                }
            }


        }

        return result;
    }
}
