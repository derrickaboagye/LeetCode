class Solution {
    /**. we are given nums and we must return pairs where i<j and |nums[i] - nums[j]| == k 
    [1,2,2,1]
       ij
    
    */
    
    public int countKDifference(int[] nums, int k) {

   int count =0;

        for(int j=1;j<nums.length;j++){
            int i=0;
              while(i<j){
                if(Math.abs(nums[i] - nums[j]) == k ){
                 count++;
                }
                i++;
              }
              
        }
        return count;
    }
}