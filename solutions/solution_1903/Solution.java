package solutions.solution_1903;

class Solution {
    public String largestOddNumber(String num) {
        int lastOdd = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) {
                lastOdd = i;
                break;
            }
        }

        if (lastOdd == -1) {
            return "";
        }

        return num.substring(0, lastOdd + 1);
    }
}
