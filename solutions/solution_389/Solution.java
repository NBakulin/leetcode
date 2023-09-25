package solutions.solution_389;

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] charsCountArray = new int[26];
        char result = 'a';

        for (char character: t.toCharArray()) {
            charsCountArray[character - 'a']++;
        }

        for (char character: s.toCharArray()) {
            charsCountArray[character - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charsCountArray[i] == 1) {
                return (char) (result + i);
            }
        }

        return result;
    }
}
