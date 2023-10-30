package solutions.solution_1356;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Comparator<Integer> comparator = new CustomComparator();
        Arrays.sort(nums, comparator);

        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        int aBitsCount = Integer.bitCount(a);
        int bBitsCount = Integer.bitCount(b);

        if (aBitsCount == bBitsCount) {
            return a - b;
        }

        return aBitsCount - bBitsCount;
    }
}
