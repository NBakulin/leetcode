package solutions.solution_2147;

class Solution {
    public int numberOfWays(String corridor) {
        long result = 1;
        int MODULO = (int)1e9 + 7;

        int consecutiveSeatsCount = 0;
        int dividerIntervalLength = 1;
        for (char letter: corridor.toCharArray()) {
            if (letter == 'S') {
                consecutiveSeatsCount++;
                if (consecutiveSeatsCount > 1 && consecutiveSeatsCount % 2 == 1) {
                    result = (result * dividerIntervalLength) % MODULO;
                    dividerIntervalLength = 1;
                }
            } else if (consecutiveSeatsCount > 1 && consecutiveSeatsCount % 2 == 0) {
                dividerIntervalLength++;
            }
        }

        if (consecutiveSeatsCount < 2 || consecutiveSeatsCount % 2 == 1) {
            return 0;
        }

        return (int)result;
    }
}
