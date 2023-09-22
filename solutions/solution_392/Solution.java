package solutions.solution_392;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        int stringLength = s.length();
        int sequenceCounter = 0;


        if (stringLength == 0) {
            return true;
        }

        if (t.length() == 0) {
            return false;
        }

        char currentLetter = s.charAt(index);

        for (char character: t.toCharArray()) {
            if (character == currentLetter) {
                sequenceCounter++;
                index++;
                if (index == stringLength) {
                    break;
                }
                currentLetter = s.charAt(index);
            }
        }

        if (index == stringLength && sequenceCounter > 0) {
            return true;
        }

        return false;
    }
}
