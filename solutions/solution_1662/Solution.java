package solutions.solution_1662;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1String = new StringBuilder();
        StringBuilder word2String = new StringBuilder();

        for (String word : word1) word1String.append(word);
        for (String word : word2) word2String.append(word);
        String s1 = word1String.toString();
        String s2 = word2String.toString();

        if (s1.equals(s2)) return true;
        else return false;
    }
}
