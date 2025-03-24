class Solution {
    public double findMaxAverage(int[] nums, int k) {

        /* Inutuion: we are given a array nums and a integer k. we must find a contiguous subarray of length k thta has a maximum average value and return it.
        
        Approach: we will use a sliding windoe to traverse the array. the length of the window will be k. we will traverse by add rightmost element and removing leftmost element. We will update the sum. we will then find the average form the given sum and return it
        
        Time complixy: O(n). Here we are using a window to traverse teh array. there are n elemenst in the arry so at most we will travse the array n times. 
        Space complixty: o(1). No additonal space is need*/

        int sum = 0;
        //find sum of 1st window 
       for(int i = 0; i < k; i ++) 
           sum += nums[i];
       int maxSum = sum;
       for(int i = k; i < nums.length; i ++) {
           sum += nums[i];
           sum -= nums[i - k];
           maxSum = Math.max(maxSum, sum);
       }
       return (double)maxSum / k;
        
    }
}