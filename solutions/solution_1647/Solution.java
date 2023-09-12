package solutions.solution_1647;

import java.util.*;

class Solution {
    public int minDeletions(String s) {
        int result = 0;
        int[] charactersCountArray = new int[26];

        for (char character: s.toCharArray()) {
            charactersCountArray[character - 'a']++;
        }

        Arrays.sort(charactersCountArray);
        for (int i = 24; i >= 0; i--) {
            if (charactersCountArray[i] == 0) {
                continue;
            }

            if (charactersCountArray[i] >= charactersCountArray[i + 1]) {
                int previousCount = charactersCountArray[i];
                charactersCountArray[i] = Math.max(0, charactersCountArray[i + 1] - 1);
                result  += previousCount - charactersCountArray[i];
            }
        }

        return result;
    }
}
