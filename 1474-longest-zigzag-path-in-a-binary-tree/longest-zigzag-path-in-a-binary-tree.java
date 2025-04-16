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
    int ans=0;
    public int longestZigZag(TreeNode root) {
        //track the count vaules if we move l/r
        int count=0;
        //for rootnode weather orginall path was right or left. we dont know, so we put 1
        char prevmove= '1';
        dfs(root, count, prevmove);
        return ans;
    }


    public void dfs(TreeNode node, int count, char prevmove){
        //base case
        if(node == null){
            return;
        }
    ans= Math.max(ans,count);
    if(prevmove == 'l'){
        //if pervious move was ;eft and we are going left we reset the count
        dfs(node.left, 1, 'l');
        //if perviouse move was left and we are going right we increenat the count
        dfs(node.right, count +1, 'r');
    } else  {
    //if perviouse move was right and we go left we incmrenat 
    dfs(node.left, count + 1, 'l');
    //if perviouse move was left and we go right
    dfs(node.right, 1, 'r');
    }

    }
}