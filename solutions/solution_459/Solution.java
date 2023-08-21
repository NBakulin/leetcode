package solutions.solution_459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length()/2; i++) {
            if (s.length() % i != 0) {
                continue;
            }

            if (this.isRepeatedSubstring(i, s) == true) {
                return true;
            }

        }

        return false;
    }

    public boolean isRepeatedSubstring(int length, String s) {
        String substring = s.substring(0, length);

        for (int i = length; i + length <= s.length(); i = i + length) {
            if (substring.equals(s.substring(i, i + length)) == false) {
                return false;
            }
        }

        return true;
    }
}