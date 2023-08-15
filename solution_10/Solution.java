package solution_10;

import java.util.Dictionary;
import java.util.Hashtable;

class Solution {

    public Dictionary<String, Boolean> cachedResults = new Hashtable<>();
    public String s;
    public String p;

    public boolean isMatch(String s, String p) {
        this.s = s;
        this.p = p;

        return isPrefixMatching(s.length() - 1, p.length() - 1);
    }

    public boolean isPrefixMatching(int stringIndex, int patternIndex) {
        String keyString = stringIndex + "_" + patternIndex;
        System.out.println(keyString);
        boolean answer = false;

        if ((this.cachedResults.get(keyString) != null && this.cachedResults.get(keyString)) || (stringIndex < 0 && patternIndex < 0)) {
            return true;
        }

        if (patternIndex >= 0) {
            char patternChar = this.p.charAt(patternIndex);

            if (stringIndex >= 0 && ((patternChar != '*' && patternChar != '.' && this.s.charAt(stringIndex) == patternChar) || patternChar == '.')) {
                answer = answer | this.isPrefixMatching(stringIndex - 1, patternIndex - 1);
            }

            if (patternChar == '*' && patternIndex > 0 && this.p.charAt(patternIndex - 1) != '.') {

                if (stringIndex >= 0 && this.p.charAt(patternIndex - 1) == this.s.charAt(stringIndex)) {
                    answer = answer | this.isPrefixMatching(stringIndex - 1, patternIndex);
                }

                answer = answer | this.isPrefixMatching(stringIndex, patternIndex - 2);
            }

            if (patternChar == '*' && patternIndex > 0 && this.p.charAt(patternIndex - 1) == '.') {

                if (stringIndex >= 0) {
                    answer = answer | this.isPrefixMatching(stringIndex - 1, patternIndex);
                }

                answer = answer | this.isPrefixMatching(stringIndex, patternIndex - 2);
            }
        }

        this.cachedResults.put(keyString, (Boolean)answer);

        return answer;
    }
}
