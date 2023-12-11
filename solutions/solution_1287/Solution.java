package solutions.solution_1287;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int target = arr.length / 4;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + target]) {
                return arr[i];
            }
        }

        return -1;
    }
}
