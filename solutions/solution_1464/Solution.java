package solutions.solution_1464;

class Solution {
    public int maxProduct(int[] nums) {
        int biggestNumber = 0;
        int secondBiggestNumber = 0;

        for (int number: nums) {
            if (biggestNumber <= number) {
                secondBiggestNumber = biggestNumber;
                biggestNumber = number;
                continue;
            }

            if (secondBiggestNumber < number) {
                secondBiggestNumber = number;
            }
        }

        return (secondBiggestNumber - 1) * (biggestNumber - 1);
    }
}
