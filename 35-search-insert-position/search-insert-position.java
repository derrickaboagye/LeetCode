class Solution {

    /** 
    
    Aproach: we are given a array of int. our goal sis to retturn the index if the target is found and if not return where it would be insrted
    
    QUestion: how do you know where it would have been inserted? 

    // [1,2,3,5,6,] target =4; we checkif if target>current indices but less than the next indcies we return indcies of i.
    SO at each i iteration we are checking if it is equal to the target if so we rreturn indices or it not we check the perivuos I and see if it is greather than i or less than the next i element if so wer returnthe next i elemenet */


    public int searchInsert(int[] nums, int target) {
         
         //if array is empty return 0.
        if(nums.length == 0){
            return 0;
        }
        
    for(int i=0; i<nums.length;i++){
        if(nums[i] == target){
            return i;
            //beacause it is a sorrted array we will only need to check if nums[i] is greater than target.
        } else if(nums[i]>target) {
            return i;
        }
    }
       return nums.length;
    
    }
}