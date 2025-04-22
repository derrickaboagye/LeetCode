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
    /**
    Inution: we are given the root node of a tree with level 1 for the root.return the smalles level wit the maxiuim sum.
     
     apporach: leevel order traversal. We will use the help of a queue data structure. as we traverse each level we will have a var to hold the max sum and a hashmap to store each level with thier vuale<level, sum>. At the end we will find the greatest vuale in the hashmap vaule  and return teh key, (which hold the level).
    
     */
   public int maxLevelSum(TreeNode root) {
    // base case
    if (root == null) {
        return 0; // return 0, not 1, since there's no level in a null tree
    }

    int maxSum = Integer.MIN_VALUE;
    int ans = 0;
    int level = 0;

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
        level++;
        int sumAtCurrentLevel = 0;
        int size = q.size(); // store level size separately

        for (int i = 0; i < size; i++) {
            TreeNode curr = q.poll();
            sumAtCurrentLevel += curr.val;

            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }

        if (sumAtCurrentLevel > maxSum) {
            maxSum = sumAtCurrentLevel;
            ans = level;
        }
    }

    return ans;
}
}