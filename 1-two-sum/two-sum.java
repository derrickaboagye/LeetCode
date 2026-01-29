class Solution {
    /** we will set first vaule in array as Differnce variable. then we will subtrack target - difference. This will give us a remainder. we will loop through the array to findteh remainder. then we will return {differnce, remainder} */
    public int[] twoSum(int[] nums, int target) {
        int differnce= nums[0];
        HashMap <Integer, Integer> map= new HashMap<>();

        //for loop
        for(int i=0;i<nums.length;i++){
            int remain= target- nums[i];
            
            if(map.containsKey(remain)){
                return new int[]{map.get(remain),i};
            }
   map.put(nums[i],i);
        }
              return new int[]{-1, -1}; 
    }

}