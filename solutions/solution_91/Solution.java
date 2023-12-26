package solutions.solution_91;

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];

        if (s.charAt(0) != 48) {
            dp[0] = 1;
        }

        for (int i = 1; i < n; i++) {
            int character = s.charAt(i) - 48;
            if (character > 0) {
                dp[i] += dp[i - 1];
            }

            int prevCharacter = s.charAt(i - 1) - 48;
            if ((prevCharacter == 2 && character < 7) || prevCharacter == 1) {
                if (i > 1) {
                    dp[i] += dp[i - 2];
                } else {
                    dp[i] += dp[0];
                }
            }
        }

        return dp[n - 1];
    }
}
