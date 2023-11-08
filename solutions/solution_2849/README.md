# [2849. Determine if a Cell Is Reachable at a Given Time](https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/description)

## Problem Description

You are given four integers `sx`, `sy`, `fx`, `fy`, and a non-negative integer `t`.

In an infinite 2D grid, you start at the cell `(sx, sy)`. Each second, you must move to any of its adjacent cells.

Return `true` if you can reach cell `(fx, fy)` after exactly `t` seconds, or `false` otherwise.

A cell's adjacent cells are the 8 cells around it that share at least one corner with it. You can visit the same cell several times.



### Example 1:

<img alt="" src="https://assets.leetcode.com/uploads/2023/08/05/example2.svg" style="width: 443px; height: 243px;">

```
Input: sx = 2, sy = 4, fx = 7, fy = 7, t = 6
Output: true
Explanation: Starting at cell (2, 4), we can reach cell (7, 7) in exactly 6 seconds by going through the cells depicted in the picture above.
```
### Example 2:

<img alt="" src="https://assets.leetcode.com/uploads/2023/08/05/example1.svg" style="width: 383px; height: 202px;">

```
Input: sx = 3, sy = 1, fx = 7, fy = 3, t = 3
Output: false
Explanation: Starting at cell (3, 1), it takes at least 4 seconds to reach cell (7, 3) by going through the cells depicted in the picture above. Hence, we cannot reach cell (7, 3) at the third second.
```

### Constraints:

* `1 <= sx, sy, fx, fy <= 10^9`
* `0 <= t <= 10^9`


## Solution Properties
* `SC = O(1)`
* `TC = O(1)`
* Runtime ~ 0 ms (`beats ~100%`)
* Memory ~ 39,3 mb (`beats ~93%`)