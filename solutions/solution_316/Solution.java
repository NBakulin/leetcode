package solutions.solution_316;

import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        boolean[] visited = new boolean[26];
        int[] lastIndexes = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndexes[s.charAt(i) - 'a'] = i;
        }
        Stack<Integer> characters = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (visited[index]) continue;

            while (characters.isEmpty() == false && index < characters.peek() && lastIndexes[characters.peek()] > i) {
                visited[characters.pop()] = false;
            }

            characters.push(index);
            visited[index] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (characters.isEmpty() == false) {
            sb.append((char)('a' + characters.pop()));
        }

        return sb.reverse().toString();
    }
}
