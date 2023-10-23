package solutions.solution_342;

class Solution {
    public boolean isPowerOfFour(int n) {
        return (Math.log10(n) / Math.log10(4)) % 1 == 0;
    }
}
