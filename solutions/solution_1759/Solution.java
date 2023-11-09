package solutions.solution_1759;

class Solution {
    public int countHomogenous(String s) {
        final int MODULO = (int)1e9 + 7;
        long result = 0;

        int currentCharacter = '1';
        int currentCharacterStreak = 0;

        for (char character: s.toCharArray()) {
            if (currentCharacter == character) {
                currentCharacterStreak++;
            } else {
                result = (result + (long)(currentCharacterStreak + 1) * currentCharacterStreak / 2);
                currentCharacter = character;
                currentCharacterStreak = 1;
            }
        }
        result = (result + (long)(currentCharacterStreak + 1) * currentCharacterStreak / 2) % MODULO;

        return (int)result;
    }
}
