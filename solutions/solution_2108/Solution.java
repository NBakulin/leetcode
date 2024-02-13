package solutions.solution_2108;

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words) {
            int n = word.length();
            boolean wordFound = true;
            for (int i = 0; i < n / 2; i++) {
                if (word.charAt(n - 1 - i) != word.charAt(i)) {
                    wordFound = false;
                    break;
                }
            }
            if (wordFound) {
                return word;
            }
        }

        return "";
    }
}
