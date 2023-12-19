package solutions.solution_22;

import java.util.ArrayList;
import java.util.List;

class Solution2 {
    List<String> result = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        this.addCharacter("(", 1, 0);

        return result;
    }

    public void addCharacter(String string, int openingsQuantity, int closingsQuantity) {
        if (openingsQuantity + closingsQuantity == n * 2) {
            this.result.add(string);
            return;
        }

        if (openingsQuantity < n) {
            this.addCharacter(string + '(', openingsQuantity + 1, closingsQuantity);
        }

        if (closingsQuantity < openingsQuantity) {
            this.addCharacter(string + ')', openingsQuantity, closingsQuantity + 1);
        }
    }
}
