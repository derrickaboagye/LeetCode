class Solution {

    /*  Inutuion: We are given a binary array, with zero & ones. we are also given an integer vaule k. Our goal here is to flip at most k 0's into 1's to find the maximum number of consecuitve 1's 
    
    Approach:n we will have a window. start and enc. For each time our end pointer enoucter sa 0. we will check if it is greater than k. if not we ill increase zero count. we will keep increaseing ero count untill it is greater than k. In that case we weil move our start to the left untill we encounter a zero. When we do encounter a zero we will decrease our zero count. We will also track current 1 and max ones. 
    //This is  a sliding window problem because we are keeping a substring of elemts while adding from one side of teh window and removing from another side. 
    
    Time complxity: O(n)
    space: O(1) */
    public int longestOnes(int[] nums, int k) {

        int zerocount=0;
        int maxzerocount=0;
        int start=0;

        for(int end=0; end<nums.length;end++){
            if(nums[end]==0){
                zerocount++;
            }


            while(zerocount>k){
                if(nums[start]==0){
                    zerocount--;
                   

                }
                start++;
            }

            maxzerocount= Math.max(end-start +1, maxzerocount);
        }
        return maxzerocount;
    }
}