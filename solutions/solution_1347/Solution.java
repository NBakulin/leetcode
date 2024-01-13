package solutions.solution_1347;

class Solution {
    public int minSteps(String s, String t) {
        int[] sChars = new int[26];
        int[] tChars = new int[26];

        for (char character: s.toCharArray()) {
            sChars[character - 'a']++;
        }

        for (char character: t.toCharArray()) {
            tChars[character - 'a']++;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sChars[i] - tChars[i]);
        }

        return result / 2;
    }
}
