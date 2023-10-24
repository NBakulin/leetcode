package solutions.solution_515;

import java.util.ArrayList;
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

    List<Integer> result;
    public List<Integer> largestValues(TreeNode root) {
        result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        this.dfs(root, 0);

        return result;
    }

    public void dfs(TreeNode root, int level) {
        if (this.result.size() < level + 1) {
            this.result.add(root.val);
        } else {
            this.result.set(level, Math.max(this.result.get(level), root.val));
        }

        if (root.left != null) {
            this.dfs(root.left, level + 1);
        }

        if (root.right != null) {
            this.dfs(root.right, level + 1);
        }
    }
}