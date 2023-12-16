package solutions.solution_242;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] lettersCount = new int[26];

        if (t.length() != s.length()) return false;
        for (char character: s.toCharArray()) lettersCount[character - 'a']++;
        for (char character: t.toCharArray()) lettersCount[character - 'a']--;

        for (int diff: lettersCount) {
            if (diff != 0) return false;
        }

        return true;
    }
}
