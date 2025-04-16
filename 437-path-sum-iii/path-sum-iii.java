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
    public int pathSum(TreeNode root, int targetSum) {
        return (int) pathSumLong(root, (long) targetSum);
    }

    private long pathSumLong(TreeNode root, long targetSum) {
        if (root == null) return 0;

        long count = countPathsFromNode(root, targetSum);
        count += pathSumLong(root.left, targetSum);
        count += pathSumLong(root.right, targetSum);

        return count;
    }

    private long countPathsFromNode(TreeNode node, long targetSum) {
        if (node == null) return 0;

        long count = 0;
        if (node.val == targetSum) count++;

        count += countPathsFromNode(node.left, targetSum - node.val);
        count += countPathsFromNode(node.right, targetSum - node.val);

        return count;
    }
}

