package solutions.solution_1578;

class Solution {
    public int minCost(String colors, int[] neededTime) {
        char previousColor = colors.charAt(0);
        int previousTime = neededTime[0];
        int result = 0;
        char color;
        int time;

        for (int i = 1; i < neededTime.length; i++) {
            color = colors.charAt(i);
            time = neededTime[i];

            if (color == previousColor) {
                if (time >= previousTime) {
                    result += previousTime;
                    previousTime = time;
                } else {
                    result += time;
                }
                continue;
            }

            previousTime = time;
            previousColor = color;
        }

        return result;
    }
}
