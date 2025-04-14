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
 Note: the maxiumum length of a binary tree is the length of the root node to the longest/last leaf node.

 Inutuion: gievena binary tree we must find teh maxuimen det o f te tree.

 Apporach: we willl use a level traversal to find the maxuimen dept. we will have a var acalled level count. We will store elemenst in. a queue. So first the root. then we check if left and right chcidren exist, if so we add them to out queue.then we incmenet count. at the end o fthe traversal we will retunr ocunt/
 
  */
class Solution {
    public int maxDepth(TreeNode root) {

      //base case
      if(root== null){
        return 0;
      }
           
//queue is a interface and must be intlaized with Linkedlist.
        Queue <TreeNode> holder= new LinkedList<>();
         holder.add(root);
         int levelcount= 0;

        while(!holder.isEmpty()){
           // TreeNode firstguy= holder.add(root.val);
           int ls= holder.size();
            

            //travers the queue 
            for(int i=0 ;i<ls; i++){
                TreeNode currentnode= holder.poll();
                if(currentnode.left != null){
                    holder.add(currentnode.left);
                } 
                if(currentnode.right != null){
                    holder.add(currentnode.right);
                }
            }
                levelcount++;
            }
        


        return levelcount;
    }
}