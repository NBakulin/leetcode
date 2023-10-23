# [1361. Validate Binary Tree Nodes](https://leetcode.com/problems/validate-binary-tree-nodes/description)

## Problem Description

You have n binary tree nodes numbered from `0` to `n - 1` where node `i` has two children `leftChild[i]` and `rightChild[i]`, return `true` if and only if all the given nodes form exactly one valid binary tree.

If node `i` has no left child then `leftChild[i]` will equal `-1`, similarly for the right child.

Note that the nodes have no values and that we only use the node numbers in this problem.



### Example 1:

<img alt="" src="https://assets.leetcode.com/uploads/2019/08/23/1503_ex1.png" style="width: 195px; height: 287px;">

```
Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
Output: true
```
### Example 2:

<img alt="" src="https://assets.leetcode.com/uploads/2019/08/23/1503_ex2.png" style="width: 183px; height: 272px;">

```
Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,3,-1,-1]
Output: false
```
### Example 3:

<img alt="" src="https://assets.leetcode.com/uploads/2019/08/23/1503_ex3.png" style="width: 82px; height: 174px;">

```
Input: n = 2, leftChild = [1,0], rightChild = [-1,-1]
Output: false
```

### Constraints:

* `n == leftChild.length == rightChild.length`
* `1 <= n <= 10^4`
* `-1 <= leftChild[i], rightChild[i] <= n - 1`

## Solution Properties

* `SC = O(n)`
* `TC = O(n)`
* Runtime ~ 3 ms (`beats ~95,9%`)
* Memory ~ 44,25 mb (`beats ~81,24%`)