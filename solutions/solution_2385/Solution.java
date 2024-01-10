package solutions.solution_2385;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxDistance = 0;
    public int amountOfTime(TreeNode root, int start) {
        this.traverse(root, start);

        return maxDistance;
    }

    public int traverse(TreeNode node, int start) {
        int depth = 0;

        if (node == null) {
            return 0;
        }

        int leftDepth = traverse(node.left, start);
        int rightDepth = traverse(node.right, start);

        if (node.val == start) {
            maxDistance = Math.max(leftDepth, rightDepth);
            depth = -1;
        } else if (leftDepth >= 0 && rightDepth >= 0) {
            depth = Math.max(leftDepth, rightDepth) + 1;
        } else {
            int distance = Math.abs(leftDepth) + Math.abs(rightDepth);
            maxDistance = Math.max(maxDistance, distance);
            depth = Math.min(leftDepth, rightDepth) - 1;
        }

        return depth;
    }
}