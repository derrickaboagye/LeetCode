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
 Binary tree; A tree with at most two nodes;
 preorder traversal;
 root -> left child -> right child
 dps. recurrsion
 
 
  */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
 List<Integer> listy= new ArrayList<>();
 preorder(root, listy);
 return listy;

        
    }

    private void preorder (TreeNode root, List<Integer> listy){
       //base check 
       if(root == null){
        return;
       }

       //preorder root -> left child -> right child
       listy.add(root.val);
       preorder(root.left, listy);
       preorder(root.right, listy);

    }
}