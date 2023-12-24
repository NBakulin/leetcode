package solutions.solution_1758;

class Solution {
    public int minOperations(String s) {
        int diff = 0;
        char currentDigit = '0';

        for (char character: s.toCharArray()) {
            if (character != currentDigit) diff++;
            currentDigit = currentDigit == '0' ? '1' : '0';
        }

        return Math.min(diff, s.length() - diff);
    }
}
