class Solution {
    /*Intuation: we are given an int array and we are asked to find the indices where the sum of all the numbers to the left is the same as the sum of the numbers to the right.If the index is on the left egde then the left sum is zero because there are no elemts to the left hence, same concept with right.


    Approach: we will first find the toal sum on the right. we will strat at index 0. the right to get the right sum we will subtract current index vaule form totoal sum. TO get the left sum we will add current index vaule to sum. We willl have a for loop that will run through the length of the array and we will keep checking if the rightsum is equla to the left sum then we essitnal found out piot.

    time complixy: 
    space complixty:
    
    */
    public int pivotIndex(int[] nums) {
//find right sum
int rightsum=0;
//populates the rightsum to get total sum 
for(int i=0;i<nums.length;i++){
    
    rightsum+=nums[i];
}
int leftsum=0;

//implement out logic 
for(int i=0;i<nums.length;i++){
    rightsum-=nums[i];
    
    if(rightsum == leftsum){
        return i;
    }

leftsum+=nums[i];
    }

return -1;
    }

}

