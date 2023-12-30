package solutions.solution_1897;

class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int[] charsCount = new int[26];
        for (String word: words) {
            for (char character: word.toCharArray()) {
                charsCount[character - 'a']++;
            }
        }

        for (int count: charsCount) {
            if (count % n != 0) {
                return false;
            }
        }

        return true;
    }
}
