class Solution {
    fun minPartitions(n: String): Int {
        var maxDigit = 0
        
        for (c in n) {
            val digit = c - '0'
            if (digit > maxDigit) {
                maxDigit = digit
                if (maxDigit == 9) return 9
            }
        }
        
        return maxDigit
    }
}