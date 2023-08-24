package solutions.solution_68;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> resultList = new ArrayList<>();
        int wordIndex = 0;

        while (wordIndex < words.length) {
            int lengthLeft = maxWidth;
            LinkedList<String> wordsList = new LinkedList<>();

            while (lengthLeft >= words[wordIndex].length()) {
                wordsList.add(words[wordIndex]);

                lengthLeft -= (words[wordIndex].length() + 1);
                wordIndex++;
                if (wordIndex >= words.length) {
                    break;
                }
            }

            int spacesCount = maxWidth - this.wordsLength(wordsList);

            String[] spacesArray;

            // For the last line of text
            if (wordIndex >= words.length) {
                spacesArray = new String[wordsList.size()];
                for (int i = 0; i < spacesArray.length; i++) {
                    if (i == spacesArray.length - 1) {
                        spacesArray[i] = " ".repeat(spacesCount - i);
                    } else {
                        spacesArray[i] = " ";
                    }
                }
            } else {
                int leastSpacesCount;

                if (wordsList.size() > 1) {
                    spacesArray = new String[wordsList.size() - 1];
                    leastSpacesCount = spacesCount / (wordsList.size() - 1);
                } else {
                    spacesArray = new String[1];
                    leastSpacesCount = spacesCount;
                }

                for (int i = 0; i < spacesArray.length; i++) {
                    int spacesForCurrentElementCount = leastSpacesCount;
                    if (wordsList.size() > 1 && spacesCount - (leastSpacesCount * (wordsList.size() - 1)) - i > 0) {
                        spacesForCurrentElementCount++;
                    }
                    spacesArray[i] = " ".repeat(spacesForCurrentElementCount);
                }
            }

            for (int i = 0; i < spacesArray.length; i++) {
                wordsList.add(i * 2 + 1, spacesArray[i]);
            }

            StringBuilder builder = new StringBuilder();
            for (String string: wordsList) {
                builder.append(string);
            }
            resultList.add(builder.toString());
        }

        return resultList;
    }

    public int wordsLength(LinkedList<String> wordsList) {
        int length = 0;
        for (String word: wordsList) {
            length += word.length();
        }

        return length;
    }
}