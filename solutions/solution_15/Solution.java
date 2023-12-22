package solutions.solution_15;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        Map<Integer, Integer> numbersWithCount = new HashMap<>();
        Set<String> triplets = new HashSet<>();
        for (int number: nums) {
            numbersWithCount.put(number, numbersWithCount.getOrDefault(number, 0) + 1);
        }
        StringBuilder sb;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int num1 = nums[i];
                int num2 = nums[j];
                int num3 = -(num1 + num2);

                if (num3 < num2) {
                    continue;
                }

                Integer num3Count = numbersWithCount.get(num3);
                if (num3Count == null) {
                    continue;
                }

                if (num1 == num3) {
                    num3Count--;
                }

                if (num2 == num3) {
                    num3Count--;
                }

                if (num3Count < 1) {
                    continue;
                }

                sb = new StringBuilder();
                sb.append(num1);
                sb.append('-');
                sb.append(num2);
                sb.append('-');
                sb.append(num3);

                if (triplets.contains(sb.toString()) == false) {
                    triplets.add(sb.toString());
                    result.add(Arrays.asList(num1, num2, num3));
                }
            }
        }

        return result;
    }
}

