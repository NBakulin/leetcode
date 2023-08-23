# 767. Reorganize String

## Problem Description

[Link to the problem 767.](https://leetcode.com/problems/reorganize-string/description/)

Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.



Example 1:
```
Input: s = "aab"
Output: "aba"
```
Example 2:
```
Input: s = "aaab"
Output: ""
```

Constraints:

* `1 <= s.length <= 500`
* `s` consists of lowercase English letters.

## Solution Properties

`n` is the total characters in the string and `k` is the total unique characters in the string.
* `SC = O(k)`
* `TC = O(n * log(k))`
* Runtime ~ 5 ms (`beats ~44%`)
* Memory ~ 41 mb (`beats ~67%`)