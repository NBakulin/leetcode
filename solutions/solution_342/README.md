# [342. Power of Four](https://leetcode.com/problems/power-of-four/description)

## Problem Description

Given an integer `n`, return `true` if it is a power of four. Otherwise, return `false`.

An integer `n` is a power of four, if there exists an integer `x` such that `n == 4x`.



### Example 1:
```
Input: n = 16
Output: true
```
### Example 2:
```
Input: n = 5
Output: false
```
### Example 3:
```
Input: n = 1
Output: true
```

### Constraints:

`-2^31 <= n <= 2^31 - 1`


Follow up: Could you solve it without loops/recursion?


## Solution Properties

* `SC = O(1)`
* `TC = O(log10(n))`
* Runtime ~ 1 ms (`beats ~76,3%`)
* Memory ~ 39,3 mb (`beats ~83,8%`)