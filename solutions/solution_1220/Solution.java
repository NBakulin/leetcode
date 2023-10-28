package solutions.solution_1220;

class Solution {
    public int countVowelPermutation(int n) {
        int MODULO = (int)1e9 + 7;
        long a = 1;
        long e = 1;
        long i = 1;
        long o = 1;
        long u = 1;


        for (int j = 1; j < n; j++) {
            long aNext = (e + i + u) % MODULO;
            long eNext = (a + i) % MODULO;
            long iNext = (e + o) % MODULO;
            long oNext = (i) % MODULO;
            long uNext = (o + i) % MODULO;

            a = aNext;
            e = eNext;
            i = iNext;
            o = oNext;
            u = uNext;
        }

        return (int)((a + e + i + o + u) % MODULO);
    }
}
