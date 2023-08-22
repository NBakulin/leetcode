 package solutions.solution_168;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public final List<String> lettersMap = new ArrayList<>(List.of("0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

    public String convertToTitle(int columnNumber) {
        return this.to26Notation(columnNumber);
    }

    public String to26Notation(int number) {
        if (number <= 26) {
            return this.lettersMap.get(number);
        }

        int divisionsCount = number / 26;
        int letterIndex;
        if (number == divisionsCount * 26) {
            letterIndex = 26;
            divisionsCount--;
        } else {
            letterIndex = number - divisionsCount * 26;
        }

        return this.to26Notation(divisionsCount) + this.lettersMap.get(letterIndex);
    }
}
