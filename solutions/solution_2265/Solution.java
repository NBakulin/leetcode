package solutions.solution_2265;

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

    int result = 0;

    public int averageOfSubtree(TreeNode root) {
        this.getSubtreeSizeAndSum(root);

        return result;
    }

    public int[] getSubtreeSizeAndSum(TreeNode root) {
        int accumulatedSum = root.val;
        int accumulatedSize = 1;

        TreeNode left = root.left;
        if (left != null) {
            int[] leftTree = this.getSubtreeSizeAndSum(left);
            accumulatedSum += leftTree[0];
            accumulatedSize += leftTree[1];
        }

        TreeNode right = root.right;
        if (right != null) {
            int[] rightTree = this.getSubtreeSizeAndSum(right);
            accumulatedSum += rightTree[0];
            accumulatedSize += rightTree[1];
        }

        if (accumulatedSum / accumulatedSize == root.val) {
            this.result++;
        }

        return new int[]{accumulatedSum, accumulatedSize};
    }
}
