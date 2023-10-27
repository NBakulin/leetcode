package solutions.solution_5;

class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 1;
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            int newLength;
            int counter = 1;
            while (i - counter >= 0 && i + counter < s.length() && s.charAt(i - counter) == s.charAt(i + counter)) counter++;

            counter--;
            newLength = counter * 2 + 1;
            if (newLength > maxLength) {
                maxLength = newLength;
                leftIndex = i - counter;
                rightIndex = i + counter;
            }

            int newLeftIndex = i;
            int newRightIndex = i + 1;
            if (newRightIndex < s.length() && s.charAt(newLeftIndex) == s.charAt(newRightIndex)) {
                while (newLeftIndex - 1 >= 0 && newRightIndex + 1 < s.length() && s.charAt(newLeftIndex - 1) == s.charAt(newRightIndex + 1)) {
                    newLeftIndex--;
                    newRightIndex++;
                }
                newLength = newRightIndex - newLeftIndex + 1;
                if (newLength > maxLength) {
                    maxLength = newLength;
                    leftIndex = newLeftIndex;
                    rightIndex = newRightIndex;
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = leftIndex; i <= rightIndex; i++) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
