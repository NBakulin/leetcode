package solutions.solution_1662;

class Solution2 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int wordIndex = 0;
        int letterIndex = 0;
        String currentWord = word2[0];
        int word2Length = word2.length;

        for (String word: word1) {
            for (Character letter: word.toCharArray()) {
                if (currentWord.length() > letterIndex) {
                    if (currentWord.charAt(letterIndex++) != letter) return false;
                } else {
                    if (word2Length > ++wordIndex) {
                        letterIndex = 0;
                        currentWord = word2[wordIndex];
                        if (currentWord.charAt(letterIndex++) != letter) return false;
                    } else {
                        return false;
                    }
                }
            }
        }

        return wordIndex == word2Length - 1 && letterIndex == word2[word2Length - 1].length();
    }
}
