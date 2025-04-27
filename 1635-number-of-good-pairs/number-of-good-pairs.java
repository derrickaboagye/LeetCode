class Solution {
    /**
    
    Inutuion: here we must find the number of good pairs
    -good pair is a pair in which nums[i]==nums[j] and i<j
     

     Apporach. first we have two pointers one at 0, and 1. we will moves both pointers in a nested loop. for eahc iteration we will compare each vaule and pointer 
     */
   public int numIdenticalPairs(int[] nums) {
        
    
        int goodcount=0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j] ){
                    goodcount++;
                }
            }
        }
        return goodcount;
    }
}

