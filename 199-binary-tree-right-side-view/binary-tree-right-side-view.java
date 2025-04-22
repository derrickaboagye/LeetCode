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
 
 
  */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> listy= new ArrayList<>();
        if(root == null){
            return listy;
        }

        Queue<TreeNode> line= new LinkedList <>();
        line.offer(root);

        while(!line.isEmpty()){
            int levelsize= line.size();
            int finalval= 0;

            for(int i=0; i<levelsize;i++){
                TreeNode curr= line.poll();
                finalval=curr.val;

                if(curr.left!=null){
                    line.offer(curr.left);
                }
                if(curr.right!=null){
                    line.offer(curr.right);
                }
            }
            listy.add(finalval);
        }

    return listy;
    } 

}