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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Queue<TreeNode> listy= new LinkedList<>();
        //put roots itnto our queue
       listy.offer(p);
       listy.offer(q);

       //check as long as queue is not empty
       while(!listy.isEmpty()){
        TreeNode first= listy.poll();
        TreeNode second= listy.poll();
        if(first == null && second ==null){
            continue;
        } else if ( first == null || second == null || first.val != second.val){
            return false;
        }
        listy.offer(first.left);
listy.offer(second.left);
listy.offer(first.right);
listy.offer(second.right);

       }
       return true;
    }
}