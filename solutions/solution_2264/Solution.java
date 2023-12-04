package solutions.solution_2264;

class Solution {
    public String largestGoodInteger(String num) {
        int streak = 1;
        char prevChar = num.charAt(0);
        Integer result = null;
        for (int i = 1; i < num.length(); i++) {
            char newChar = num.charAt(i);
            if (newChar == prevChar) {
                streak++;

                int newValue = Character.getNumericValue(newChar);
                if (streak > 2) {
                    if (result != null) {
                        if (newValue > result) {
                            result = newValue;
                        }
                    } else {
                        result = newValue;
                    }
                }
            } else {
                streak = 1;
            }
            prevChar = newChar;
        }

        if (result == null) {
            return "";
        }

        return result.toString().repeat(3);
    }
}
