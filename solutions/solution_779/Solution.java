package solutions.solution_779;

class Solution {
    public int kthGrammar(int n, int k) {
        int power = (int)Math.ceil(Math.log(k) / Math.log(2));

        return this.getDigit(power, k);
    }

    public int getDigit(int n, int k) {
        if (n == 0) {
            return 0;
        }

        int prevNLength = (int)Math.pow(2, n - 1);
        if (k > Math.pow(2, n - 1)) {
            return 1 - getDigit(n - 1, k - prevNLength);
        } else {
            return getDigit(n - 1, k);
        }
    }
}
