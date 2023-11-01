package solutions.solution_501;

import java.util.*;

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
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> maxValueIndexes = new LinkedList<>();

    int maxCount = 0;
    public int[] findMode(TreeNode root) {
        this.traverse(root);

        return maxValueIndexes.stream().mapToInt(Integer::intValue).toArray();
    }

    public void traverse(TreeNode node) {
        int newValueCount = map.getOrDefault(node.val, 0) + 1;

        if (newValueCount == maxCount) {
            maxValueIndexes.add(node.val);
        }

        if (newValueCount > maxCount) {
            maxValueIndexes = (new LinkedList<>());
            maxValueIndexes.add(node.val);
            maxCount = newValueCount;
        }

        map.put(node.val, newValueCount);

        if (node.left != null) {
            traverse(node.left);
        }
        if (node.right != null) {
            traverse(node.right);
        }
    }
}
