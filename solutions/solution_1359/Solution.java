 package solutions.solution_1359;

class Solution {
    public int countOrders(int n) {
        final int MODULO = (int)1e9 + 7;
        long res = 1;

        for (int i = 2; i <= 2 * n; i++) {
            res = (res * (i % 2 == 0 ? i / 2 : i)) % MODULO;
        }

        return (int)res;
    }
}
