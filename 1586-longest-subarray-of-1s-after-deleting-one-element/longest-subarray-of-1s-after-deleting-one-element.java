class Solution {

    /*  Intutuion: 
we are given binaey array and we have to delete one lemnt in our subarray. to get a subarray conatining only 1's. 

 Apporach: we will have a window. bothe pointers starting at 0 index. we will keep track of the 0's we run into. So the next zero we hit will mark a start of a new subarray
 we will keep track of how many 0s we run into and current and max sub length.



   Time complixy:
   Space complxy:  
    */
    public int longestSubarray(int[] nums) {

        int start=0;
        int zerocount=0;
        int longestwindow=0;

for(int end=0; end<nums.length; end++){
    if(nums[end]==0){
        zerocount++;
    }

    while(zerocount>1){
        if(nums[start]==0){
            //reason why we will do zercount-- is because if start has a zero we need to remove its count.
            zerocount--;
        }
        start++;
    }

    longestwindow= Math.max(longestwindow, end-start);
}
        
        return longestwindow; 
    }
    
}