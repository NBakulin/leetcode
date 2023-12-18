package solutions.solution_1913;

class Solution {
    public int maxProductDifference(int[] nums) {
        int biggest = 0;
        int secondBiggest = 0;
        int smallest = (int)1e4 + 1;
        int secondSmallest = (int)1e4 + 1;

        for (int number: nums) {
            if (biggest < number) {
                secondBiggest = biggest;
                biggest = number;
            } else if (secondBiggest < number) {
                secondBiggest = number;
            }

            if (smallest > number) {
                secondSmallest = smallest;
                smallest = number;
            } else if (secondSmallest > number) {
                secondSmallest = number;
            }
        }

        return biggest * secondBiggest - smallest * secondSmallest;
    }
}
