 package solutions.solution_135;

class Solution {
    public int candy(int[] ratings) {
        int result = ratings.length;
        int previousSweetsCount = 1;
        int nonDecreasingSequenceLength = 0;
        int sequenceStartSize = 0;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] <  ratings[i]) {
                nonDecreasingSequenceLength = sequenceStartSize = 0;
                result += previousSweetsCount++;
                continue;
            }

            if (ratings[i - 1] ==  ratings[i]) {
                previousSweetsCount = 1;
                nonDecreasingSequenceLength = sequenceStartSize = 0;
                continue;
            }

            nonDecreasingSequenceLength++;
            if (sequenceStartSize == 0) {
                sequenceStartSize = previousSweetsCount;
            }
            if (previousSweetsCount == 1) {
                if (sequenceStartSize > nonDecreasingSequenceLength) {
                    result--;
                }
                result += nonDecreasingSequenceLength;
            }
            previousSweetsCount = 1;
        }

        return result;
    }
}
