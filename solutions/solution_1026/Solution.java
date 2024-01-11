package solutions.solution_1026;

class Solution {
    int result = 0;

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return result;
    }

    public void dfs(TreeNode node, int max, int min) {
        if (node == null) return;

        result = Math.max(Math.max(result, Math.abs(max - node.val)), Math.abs(min - node.val));

        int newMax = Math.max(node.val, max);
        int newMin = Math.min(node.val, min);

        dfs(node.left, newMax, newMin);
        dfs(node.right, newMax, newMin);
    }
}
