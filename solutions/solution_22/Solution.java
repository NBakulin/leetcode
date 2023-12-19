package solutions.solution_22;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> previousSet = new HashSet<>();
        previousSet.add("");
        StringBuilder sb;
        Set<String> newSet;

        for (int i = 1; i <= n; i++) {
            newSet = new HashSet<>();
            for (String variation : previousSet) {
                for (int j = 0; j <= variation.length(); j++) {
                    sb = new StringBuilder(variation);
                    sb.insert(j, "()");
                    newSet.add(sb.toString());
                }
            }
            previousSet = newSet;
        }

        return previousSet.stream().toList();
    }
}
