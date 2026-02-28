class Solution {
    fun concatenatedBinary(n: Int): Int {
        var accumulator = 0L
        var bitsCount = 0
        val modulo = 1_000_000_007L
        
        for (i in 1..n) {
            if (i and (i - 1) == 0) {
                bitsCount++
            }

            accumulator = ((accumulator shl bitsCount) + i) % modulo
        }
        
        return accumulator.toInt()
    }
}