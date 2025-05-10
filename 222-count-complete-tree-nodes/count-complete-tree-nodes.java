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
    //** Brute force method. will be to count each node, dfs staring at root. Have a countter. so for each node we land we increment the counter till dfs is done. return count,  */
    public int countNodes(TreeNode root) {

     return  dfs(root);
        
    }

       public int dfs(TreeNode root){
         if(root == null){
            return 0;
           

         }
          return 1 + dfs(root.left) + dfs(root.right);
       
       }
}