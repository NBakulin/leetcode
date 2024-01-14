package solutions.solution_1657;

import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] word1Chars = new int[26];
        int[] word2Chars = new int[26];

        if (word1.length() != word2.length()) {
            return false;
        }

        for (char character: word1.toCharArray()) {
            word1Chars[character - 'a']++;
        }

        for (char character: word2.toCharArray()) {
            word2Chars[character - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            int wc1 = word1Chars[i];
            int wc2 = word2Chars[i];

            if (wc1 == wc2 || (wc1 > 0 && wc2 > 0)) {
                continue;
            }
            return false;
        }

        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        for (int i = 0; i < 26; i++) {
            if ( word1Chars[i] != word2Chars[i]) {
                return false;
            }
        }

        return true;
    }
}
