package solutions.solution_97;

class Solution {
    int[][] cachedResults;
    String s1, s2, s3;

    public boolean isInterleave(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

        int s1Length = s1.length();
        int s2Length = s2.length();

        this.cachedResults = new int[s1Length][s2Length];
        for (int row = 0; row < s1Length; row++) {
            for (int col = 0; col < s2Length; col++) {
                this.cachedResults[row][col]=-1;
            }
        }

        if (s1Length + s2Length != s3.length()) {
            return false;
        }

        if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) {
            return true;
        }

        return this.hasValidPrefix(s1.length() - 1, s2.length() - 1, s3.length() - 1);
    }

    public boolean hasValidPrefix(int i1, int i2, int i3) {
        boolean response = false;

        if (i1 == -1) {
            return this.s2.substring(0, i2 + 1).equals(this.s3.substring(0, i3 + 1));
        }
        if (i2 == -1) {
            return this.s1.substring(0, i1 + 1).equals(this.s3.substring(0, i3 + 1));
        }

        if (this.cachedResults[i1][i2]>-1)
            return (this.cachedResults[i1][i2] == 1) ? true : false;

        if (i1 >= 0 && i3 >= 0 && this.s1.charAt(i1) == this.s3.charAt(i3)) {
            response = response | this.hasValidPrefix(i1 - 1, i2, i3 - 1);
        }

        if (i2 >= 0 && i3 >= 0 && this.s2.charAt(i2) == this.s3.charAt(i3)) {
            response = response | this.hasValidPrefix(i1, i2 - 1, i3 - 1);
        }

        this.cachedResults[i1][i2]=(response) ? 1 :0;

        return response;
    }
}