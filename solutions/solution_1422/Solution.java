package solutions.solution_1422;

class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int onesCount = 0;
        int result = 0;
        int newResult = 0;

        if (s.charAt(0) == '1') {
            onesCount--;
            newResult++;
        }

        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == '1') {
                onesCount++;
                newResult--;
            } else {
                newResult++;
            }

            if (result < newResult) {
                result = newResult;
            }
        }

        if (s.charAt(s.length() - 1) == '1') {
            result++;
        }

        return result + onesCount;
    }
}
