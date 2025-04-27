class Solution {
    //** for every ith numer it is teh sum of teh previos number  */
    public int[] runningSum(int[] nums) {
    
int sum = 0;
int[] res = new int[nums.length];

for (int i = 0; i < nums.length; i++) {
    sum += nums[i];  // add the current number to the sum
    res[i] = sum;    // store the running sum at index i
}

    return res;
}
}