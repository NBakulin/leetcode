package solutions.solution_338;

class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        if (n == 0) {
            return result;
        }

        result[1] = 1;
        if (n == 1) {
            return result;
        }

        int rangeStart = 2;
        int rangeEnd = 3;
        int prevRangeLength = 1;
        for (int i = 2; i < n + 1; i++) {
            int newValue = result[i - prevRangeLength];
            if (i - prevRangeLength >= rangeStart) {
                newValue++;
            }
            result[i] = newValue;

            if (i == rangeEnd) {
                prevRangeLength = rangeEnd - rangeStart + 1;
                rangeStart = rangeEnd + 1;
                rangeEnd = rangeStart * 2 - 1;
            }
        }

        return result;
    }
}
