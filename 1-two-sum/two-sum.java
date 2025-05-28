class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        HashMap<Integer, Integer> hashy= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff= target- nums[i];
            if(hashy.containsKey(diff)){
                 return new int[]{hashy.get(diff), i};

            }else 
            hashy.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}