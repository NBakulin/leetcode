package solutions.solution_938;

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
    int low;
    int high;
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        dfs(root);

        return sum;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.val > low) {
            dfs(node.left);
        }

        if (node.val < high) {
            dfs(node.right);
        }

        if (node.val >= low && node.val <= high) {
            sum += node.val;
        }
    }
}
