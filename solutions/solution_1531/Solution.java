//package solutions.solution_1531;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        var pq = new PriorityQueue<Integer>((a, b) -> {
            if (a.equals(2)) {
                return 1;
            }

            if (a < 10 && b < 10) {
                return a.compareTo(b);
            }

            if (a > 9 && b > 9) {
                return a.compareTo(b);
            }

            if (a > 9) {
                if (a / 10 < 2) {
                    return (Integer.valueOf(a % 10)).compareTo(b);
                }
            } else if (b / 10 < 2) {
                return (a).compareTo(Integer.valueOf(b % 10));
            }

            return a.compareTo(b);
        });

        char currentCharacter = s.charAt(0);
        int charStreak = 1;
        for (int i = 1; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == currentCharacter) {
                charStreak++;
            } else {
                currentCharacter = character;
                pq.add(charStreak);
                charStreak = 1;
            }
        }
        pq.add(charStreak);

        for (int i = 0; i < k; i++) {
            int value = pq.poll();
            value--;
            pq.add(value);
        }

        System.out.println(Arrays.toString(pq.toArray()));
        int result = 0;
        while (pq.isEmpty() == false) {
            int value = pq.poll();

            if (value == 1) {
                result++;
                continue;
            }

            if (value > 0) {
                result += 1 + String.valueOf(value).length();
            }
        }

        return result;
    }
}
