package solutions.solution_1496;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        int currentX = 0;
        int currentY = 0;
        Set<String> pointsMap = new HashSet<>();

        pointsMap.add("0-0");
        StringBuilder sb;
        for (char character: path.toCharArray()) {
            sb = new StringBuilder();
            switch (character) {
                case 'N' -> currentY++;
                case 'S' -> currentY--;
                case 'E' -> currentX++;
                case 'W' -> currentX--;
            }

            sb.append(currentX);
            sb.append('-');
            sb.append(currentY);
            String newKey = sb.toString();
            if (pointsMap.contains(newKey)) {
                return true;
            }
            pointsMap.add(newKey);
        }

        return false;
    }
}
