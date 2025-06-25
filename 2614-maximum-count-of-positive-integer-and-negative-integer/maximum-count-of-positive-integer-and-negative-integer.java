class Solution {
    /**.  */
    public int maximumCount(int[] nums) {

        //var to hold neg and pos count 
        int neg=0;
        int pos=0;
        //var to hold max
        int max=0;

//for loop to check if nums[i] is pos or neg
        for(int i=0; i<nums.length;i++){
            if(nums[i]>0){
                pos++;
            } else if(nums[i]<0){
                neg++;
            }

           max= Math.max(pos,neg);

        }
        return max;

        
    }
}