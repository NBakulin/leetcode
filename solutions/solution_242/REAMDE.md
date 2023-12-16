# [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/description)

## Problem Description

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



### Example 1:
```
Input: s = "anagram", t = "nagaram"
Output: true
```
### Example 2:
```
Input: s = "rat", t = "car"
Output: false
```

### Constraints:

* `1 <= s.length, t.length <= 5 * 10^4`
* `s` and `t` consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?


## Solution Properties

* `SC = O(1)`
* `TC = O(n + m)`
* Runtime ~ 2 ms (`beats ~98,4%`)
* Memory ~ 42,9 mb (`beats ~71,3%`)
