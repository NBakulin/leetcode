package solutions.solution_1160;

class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsCount = new int[26];
        int charsLength = chars.length();
        for (Character character: chars.toCharArray()) {
            charsCount[character - 'a']++;
        }

        int result = 0;
        for (String word: words) {
            int wordLength = word.length();
            if (charsLength < wordLength) continue;

            int lettersInSetCount = 0;
            int[] wordCharsCount = charsCount.clone();
            for (Character letter: word.toCharArray()) {
                int newChar = letter - 'a';
                wordCharsCount[newChar]--;
                if (wordCharsCount[newChar] >= 0) lettersInSetCount++;
                else break;
            }

            if (lettersInSetCount == wordLength) result += wordLength;
        }

        return result;
    }
}
