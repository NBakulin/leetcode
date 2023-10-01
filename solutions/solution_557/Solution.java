package solutions.solution_557;

class Solution {
    public String reverseWords(String s) {
        StringBuilder sentenceBuilder = new StringBuilder();
        StringBuilder wordBuilder = new StringBuilder();

        for (char character: s.toCharArray()) {
            if (character == ' ') {
                sentenceBuilder.append(wordBuilder);
                sentenceBuilder.append(' ');
                wordBuilder = new StringBuilder();
                continue;
            }
            wordBuilder.insert(0, character);
        }

        sentenceBuilder.append(wordBuilder);

        return sentenceBuilder.toString();
    }
}
