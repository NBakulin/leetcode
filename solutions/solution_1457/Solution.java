package solutions.solution_1457;

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
    int[] elementsCount = new int[9];
    int result = 0;
    public int pseudoPalindromicPaths(TreeNode root) {
        traverse(root);

        return result;
    }

    public void traverse(TreeNode root) {
        elementsCount[root.val - 1]++;
        if (root.left == null && root.right == null) {
            int oddCount = 0;
            for (int i = 0; i < 9; i++) {
                if (oddCount > 1) break;
                if (elementsCount[i] % 2 == 1) oddCount++;
            }

            if (oddCount < 2) result++;
            elementsCount[root.val - 1]--;
            return;
        }

        if (root.left != null) traverse(root.left);
        if (root.right != null) traverse(root.right);
        elementsCount[root.val - 1]--;
    }
}
