# [1048. Longest String Chain](https://leetcode.com/problems/longest-string-chain/description)

## Problem Description

You are given an array of `words` where each word consists of lowercase English letters.

`word`<sub>A</sub> is a predecessor of `word`<sub>B</sub> if and only if we can insert exactly one letter anywhere in `word`<sub>A</sub> **without changing the order of the other characters** to make it equal to `word`<sub>B</sub>.

* For example, `"abc"` is a predecessor of `"abac"`, while `"cba"` is not a **predecessor** of `"bcad"`.

A **word chain** is a sequence of words `[word1, word2, ..., wordk]` with `k >= 1`, where `word`<sub>1</sub> is a **predecessor** of `word`<sub>2</sub>, `word`<sub>2</sub> is a predecessor of `word`<sub>3</sub>, and so on. A single word is trivially a word chain with `k == 1`.

Return the **length** of the **longest possible word chain** with words chosen from the given list of `words`.



### Example 1:
```
Input: words = ["a","b","ba","bca","bda","bdca"]
Output: 4
Explanation: One of the longest word chains is ["a","ba","bda","bdca"].
```
### Example 2:
```
Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
Output: 5
Explanation: All the words can be put in a word chain ["xb", "xbc", "cxbc", "pcxbc", "pcxbcf"].
```
### Example 3:
```
Input: words = ["abcd","dbqca"]
Output: 1
Explanation: The trivial word chain ["abcd"] is one of the longest word chains.
["abcd","dbqca"] is not a valid word chain because the ordering of the letters is changed.
```

### Constraints:

* `1 <= words.length <= 1000`
* `1 <= words[i].length <= 16`
* `words[i]` only consists of lowercase English letters.

## Solution properties

* `SC = O(n)` where `n` stays for `words` length
* `TC = O(l)` where `l` stays for the sum of all words' length
* Runtime ~ 37 ms (`beats ~72%`)
* Memory ~ 44 mb (`beats ~46%`)