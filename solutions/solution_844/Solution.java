package solutions.solution_844;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return this.getEditorString(s).equals(this.getEditorString(t));
    }

    public String getEditorString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char character: s.toCharArray()) {
            if (character == '#') {
                if (stack.isEmpty() == false) {
                    stack.pop();
                }
                continue;
            }

            stack.push(character);
        }

        return String.valueOf(stack);
    }
}
