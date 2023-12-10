package solutions.solution_94;

import java.util.LinkedList;
import java.util.List;

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
    LinkedList<Integer> result = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        this.visitNode(root);
        return result;
    }

    public void visitNode(TreeNode node) {
        if (node == null) return;
        this.visitNode(node.left);
        this.result.add(node.val);
        this.visitNode(node.right);
    }
}
