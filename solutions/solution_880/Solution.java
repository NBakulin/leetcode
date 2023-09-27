 package solutions.solution_880;

class Solution {
    public String decodeAtIndex(String s, int k) {
        long stringLength = 0;
        int i;

        for (i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (Character.isDigit(s.charAt(i))) {
                stringLength *=  character - '0';
            } else {
                if (stringLength == k) {
                    return String.valueOf(character);
                }
                stringLength++;
            }

            if (stringLength >= k) {
                break;
            }
        }

        k--;
        while (i > 0) {
            char character = s.charAt(i);
            boolean isDigit = Character.isDigit(character);

            if (stringLength == k + 1 && isDigit == false) {
                return String.valueOf(character);
            }

            if (isDigit == false) {
                stringLength--;
            } else {
                stringLength /= (character - '0');
                if (stringLength > 0) {
                    k = k % (int)stringLength;
                }
            }
            i--;
        }

        return String.valueOf(s.charAt(k));
    }
}