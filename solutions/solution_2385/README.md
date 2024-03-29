# [2385. Amount of Time for Binary Tree to Be Infected](https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/description)

## Problem Description

You are given the `root` of a binary tree with unique values, and an integer `start`. At minute `0`, an infection starts from the node with value `start`.

Each minute, a node becomes infected if:

* The node is currently uninfected.
* The node is adjacent to an infected node.

Return the number of minutes needed for the entire tree to be infected.



### Example 1:
<img alt="" src="https://assets.leetcode.com/uploads/2022/06/25/image-20220625231744-1.png" style="width: 400px; height: 306px;">

```
Input: root = [1,5,3,null,4,10,6,9,2], start = 3
Output: 4
Explanation: The following nodes are infected during:
- Minute 0: Node 3
- Minute 1: Nodes 1, 10 and 6
- Minute 2: Node 5
- Minute 3: Node 4
- Minute 4: Nodes 9 and 2
  It takes 4 minutes for the whole tree to be infected so we return 4.
```
### Example 2:
<img alt="" src="https://assets.leetcode.com/uploads/2022/06/25/image-20220625231812-2.png" style="width: 75px; height: 66px;">

```
Input: root = [1], start = 1
Output: 0
Explanation: At minute 0, the only node in the tree is infected so we return 0.
```

### Constraints:

* The number of nodes in the tree is in the range 1.
* `1 <= Node.val <= 10^5`
* Each node has a unique value.
* A node with a value of `start` exists in the tree.


## Solution Properties
* `SC = O(n)`
* `TC = O(n)`
* Runtime ~ 8 ms (`beats ~97,8%`)
* Memory ~ 77,9 mb (`beats ~62,3%`)