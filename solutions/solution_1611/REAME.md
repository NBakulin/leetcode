# [1611. Minimum One Bit Operations to Make Integers Zero](https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/description)

## Problem Description

Given an integer `n`, you must transform it into `0` using the following operations any number of times:

* Change the rightmost (`0`<sup>th</sup>) bit in the binary representation of `n`.
* Change the `i`<sup>th</sup> bit in the binary representation of `n` if the `(i-1)`<sup>th</sup> bit is set to `1` and the `(i-2)`<sup>th</sup> through `0`<sup>th</sup> bits are set to `0`.

Return the minimum number of operations to transform `n` into `0`.

### Example 1:
```
Input: n = 3
Output: 2
Explanation: The binary representation of 3 is "11".
"11" -> "01" with the 2nd operation since the 0th bit is 1.
"01" -> "00" with the 1st operation.
```
### Example 2:
```
Input: n = 6
Output: 4
Explanation: The binary representation of 6 is "110".
"110" -> "010" with the 2nd operation since the 1st bit is 1 and 0th through 0th bits are 0.
"010" -> "011" with the 1st operation.
"011" -> "001" with the 2nd operation since the 0th bit is 1.
"001" -> "000" with the 1st operation.
```

### Constraints:

* `0 <= n <= 10^9`


## Solution Properties

* `SC = O(log(n))`
* `TC = O(log(n) ^ 2)`
* Runtime ~ 0 ms (`beats ~100%`)
* Memory ~ 39,6 mb (`beats ~27,5%`)