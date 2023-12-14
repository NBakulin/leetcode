# [1582. Special Positions in a Binary Matrix](https://leetcode.com/problems/special-positions-in-a-binary-matrix/description)

## Problem Description

Given an `m x n` binary matrix `mat`, return the number of special positions in mat.

A position `(i, j)` is called special if `mat[i][j] == 1` and all other elements in row `i` and column `j` are `0` (rows and columns are 0-indexed).



### Example 1:

<img alt="" src="https://assets.leetcode.com/uploads/2021/12/23/special1.jpg" style="width: 244px; height: 245px;">

```
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
```

### Example 2:

<img alt="" src="https://assets.leetcode.com/uploads/2021/12/24/special-grid.jpg" style="width: 244px; height: 245px;">

```
Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
```

### Constraints:

* `m == mat.length`
* `n == mat[i].length`
* `1 <= m, n <= 100`
* `mat[i][j]` is either `0` or `1`.


## Solution Properties

* `SC = O(1)`
* `TC = O(n)`
* Runtime ~ 1 ms (`beats ~99,8%`)
* Memory ~ 43,6 mb (`beats ~74,2%`)