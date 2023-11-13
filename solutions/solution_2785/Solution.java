package solutions.solution_2785;

import java.util.*;

class Solution {
    public String sortVowels(String s) {
        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        LinkedList<Character> consonantsQueue = new LinkedList<>();
        LinkedList<Character> vowelsQueue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (vowelsSet.contains(character)) {
                vowelsQueue.add(character);
            } else {
                consonantsQueue.add(character);
            }
        }

        Collections.sort(vowelsQueue);
        StringBuilder result = new StringBuilder();
        for (char character: s.toCharArray()) {
            if (vowelsSet.contains(character)) {
                character = vowelsQueue.poll();
            } else {
                character = consonantsQueue.poll();
            }
            result.append(character);
        }

        return result.toString();
    }
}
