package solutions.solution_455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = 0;
        int childIndex = 0;

        while (cookieIndex < s.length && childIndex < g.length) {
            if (g[childIndex] <= s[cookieIndex]) {
                childIndex++;
                cookieIndex++;
                continue;
            }
            cookieIndex++;
        }

        return childIndex;
    }
}
