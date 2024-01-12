package solutions.solution_1704;

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int a = countVowels(s.substring(0, n / 2));
        int b = countVowels(s.substring(n / 2, n));

        return a == b;
    }

    public int countVowels(String s) {
        String vowels = "aeiouAEIOU";
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (vowels.indexOf(character) != -1) {
                result++;
            }
        }

        return result;
    }
}
