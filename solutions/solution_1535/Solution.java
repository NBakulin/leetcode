package solutions.solution_1535;

class Solution {
    public int getWinner(int[] arr, int k) {
        int winStreak = 0;
        int localMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int newValue = arr[i];
            if (localMax > newValue) {
                winStreak++;
            } else {
                winStreak = 1;
                localMax = newValue;
            }

            if (winStreak == k) {
                return localMax;
            }
        }

        return localMax;
    }
}
