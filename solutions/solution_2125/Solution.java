package solutions.solution_2125;

class Solution {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int previousCount = 0;
        int newCount = 0;

        for (String s: bank) {
            for (char character: s.toCharArray()) {
                if (character == '1') {
                    newCount++;
                }
            }

            if (newCount > 0) {
                result += newCount * previousCount;
                previousCount = newCount;
                newCount = 0;
            }
        }

        return result;
    }
}
