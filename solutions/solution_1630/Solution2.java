package solutions.solution_1630;

import java.util.*;

class Solution2 {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            result.add(isArithmetic(Arrays.copyOfRange(nums, l[i], r[i] + 1)));
        }

        return result;
    }

    public Boolean isArithmetic(int[] arr) {
        int m = arr.length;
        int min = arr[0];
        int max = arr[0];
        Set<Integer> arrSet = new HashSet<>();

        for (int number: arr) {
            min = Math.min(min, number);
            max = Math.max(max, number);
            arrSet.add(number);
        }

        if ((max - min) % (m - 1) != 0) return false;
        int diff = (max - min) / (m - 1);
        if (max != min && arrSet.size() != m) return false;

        for (int i = 0; i < m; i++) {
            if (!arrSet.contains((min + i * diff))) return false;
        }

        return true;
    }
}
