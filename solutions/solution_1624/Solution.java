package solutions.solution_1624;

import java.util.Arrays;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] lettersLastOccurence = new int[26];
        int[] lettersDiff = new int[26];

        Arrays.fill(lettersLastOccurence, -1);
        Arrays.fill(lettersDiff, -1);

        int n = s.length();
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (lettersLastOccurence[index] == -1) {
                lettersLastOccurence[index] = i;
                continue;
            }

            lettersDiff[index] = i - lettersLastOccurence[index] - 1;
        }

        int result = -1;
        for (int diff: lettersDiff) {
            if (diff >= result) {
                result = diff;
            }
        }

        return result;
    }
}