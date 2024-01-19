# [931. Minimum Falling Path Sum](https://leetcode.com/problems/minimum-falling-path-sum/description)

## Problem Description

Given an `n x n` array of integers `matrix`, return the minimum sum of any falling path through `matrix`.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position `(row, col)` will be `(row + 1, col - 1)`, `(row + 1, col)`, or `(row + 1, col + 1)`.



### Example 1:
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/03/failing1-grid.jpg" style="width: 499px; height: 500px;">

```
Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
Output: 13
Explanation: There are two falling paths with a minimum sum as shown.
```
### Example 2:
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/03/failing2-grid.jpg" style="width: 164px; height: 365px;">

```
Input: matrix = [[-19,57],[-40,-5]]
Output: -59
Explanation: The falling path with a minimum sum is shown.
```

### Constraints:

* `n == matrix.length == matrix[i].length`
* `1 <= n <= 100`
* `-100 <= matrix[i][j] <= 100`


* `SC = O(n)`
* `TC = O(n)`
* Runtime ~ 3 ms (`beats ~78,5%`)
* Memory ~ 45,1 mb (`beats ~47,9%`)