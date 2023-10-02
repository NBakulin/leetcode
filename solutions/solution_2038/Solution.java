package solutions.solution_2038;

class Solution {
    public boolean winnerOfGame(String colors) {
        int turnsCountDifference = 0;
        int currentASequence = 0;
        int currentBSequence = 0;

        for (char character: colors.toCharArray()) {
            if (character == 'A') {
                currentBSequence = 0;
                currentASequence++;
                if (currentASequence >= 3) {
                    turnsCountDifference++;
                }
            } else {
                currentASequence = 0;
                currentBSequence++;
                if (currentBSequence >= 3) {
                    turnsCountDifference--;
                }
            }
        }

        return turnsCountDifference > 0;
    }
}
