package solutions.solution_606;

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

    StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode root) {
        this.traverseTree(root);

        return this.sb.toString();
    }

    public void traverseTree(TreeNode node) {
        this.sb.append(node.val);

        if (node.left != null) {
            this.sb.append('(');
            this.traverseTree(node.left);
            this.sb.append(')');
        }

        if (node.right != null) {
            if (node.left == null) {
                this.sb.append("()");
            }

            this.sb.append('(');
            this.traverseTree(node.right);
            this.sb.append(')');
        }
    }
}