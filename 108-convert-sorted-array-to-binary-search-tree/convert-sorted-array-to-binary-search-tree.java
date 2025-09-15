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
    public TreeNode sortedArrayToBST(int[] nums) {

         return   convert(nums,0,nums.length-1);
        
    }


    //helper function
 
//private so its only ascebale to the whoel class. we pass in out nums array and left and right int vaules 
    private TreeNode convert (int[] nums, int left, int right){

        //base check
        if(left>right){
            return null;
        }

        //set ou rmid var to this given that the array is sorte d
        int mid= left+ (right -left)/2;
        //set our mid to root node
        TreeNode node= new TreeNode(nums[mid]);


//we recurruly chekc left and right node but this time we pass, array, side we check and the rootnode aka mid-1(to move range)
      node.left= convert(nums, left, mid-1);
      node.right= convert(nums, mid+1,right);
return node;
    }

}