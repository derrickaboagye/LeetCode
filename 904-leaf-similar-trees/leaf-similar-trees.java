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

 /**
 root1 : 67498
 root2:  67498

BFS - level by level
DFS- 
 we will use a list because it will dymanically expand as we place elemnts in it
 comapre both vaules of the lits and return true if same and false if otherwise.
  */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> root1List = new ArrayList<>();
        List<Integer> root2List = new ArrayList<>();

        // Perform DFS on both trees
        dfs(root1, root1List);
        dfs(root2, root2List);

        // Check if the lists are the same
        return root1List.equals(root2List);
    }
    
    // Helper function for DFS
    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        
        // If it's a leaf node, add its value to the list
        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        // Recursively traverse left and right subtrees
        dfs(node.left, list);
        dfs(node.right, list);
    }
}
