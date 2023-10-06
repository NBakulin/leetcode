package solutions.solution_343;

class Solution {
    public int integerBreak(int n) {
        if (n <= 3) return n - 1;

        int remainder = n % 3;
        int threesCount = n / 3;

        if (remainder == 0) return (int)Math.pow(3, threesCount);
        if (remainder == 1) return (int)Math.pow(3, threesCount - 1) * 4;

        return (int)Math.pow(3, threesCount) * 2;
    }
}
