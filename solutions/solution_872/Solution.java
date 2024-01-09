package solutions.solution_872;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    Queue<Integer> nodes;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        this.nodes = new LinkedList<>();

        dfs(root1);
        return rdfs(root2) && nodes.isEmpty();
    }

    public void dfs(TreeNode node) {
        if (node.left == null && node.right == null) {
            nodes.add(node.val);
            return;
        }

        if (node.left != null) {
            dfs(node.left);
        }
        if (node.right != null) {
            dfs(node.right);
        }
    }

    public boolean rdfs(TreeNode node) {
        boolean result = true;

        if (nodes.isEmpty()) {
            return false;
        }

        if (node.left == null && node.right == null) {
            if (!nodes.poll().equals(node.val)) {
                result = false;
            }

            return result;
        }

        if (node.left != null) {
            result &= rdfs(node.left);
        }
        if (node.right != null) {
            result &= rdfs(node.right);
        }

        return result;
    }
}
