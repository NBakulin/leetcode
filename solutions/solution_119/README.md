# [119. Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/description)

## Problem Description

Given an integer `rowIndex`, return the `rowIndex`<sup>th</sup> **(0-indexed)** row of the **Pascal's triangle**.

In **Pascal's triangle**, each number is the sum of the two numbers directly above it as shown:

<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif" style="height: 240px; width: 260px;">

### Example 1:
```
Input: rowIndex = 3
Output: [1,3,3,1]
```
### Example 2:
```
Input: rowIndex = 0
Output: [1]
```
### Example 3:
```
Input: rowIndex = 1
Output: [1,1]

```
### Constraints:

* `0 <= rowIndex <= 33`

**Follow up**: Could you optimize your algorithm to use only `O(rowIndex)` extra space?

## Solution Properties

* `SC = O(n)` T(n) stays for **Triangular number**
* `TC = O(n^2)`
* Runtime ~ 1 ms (`beats ~80%`)
* Memory ~ 39 mb (`beats ~100%`)