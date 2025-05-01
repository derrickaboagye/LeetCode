class Solution {
    /** I: We are given a int array and are asked to find a target vuale in the array
A1: loop through array if we find target return it else return -1. time complity; 0(n)
A2: we will us ebinary search. we will divid the array half. so if array lenth is n. n/2. since teh array is sorted in ascending ordder. if n/2 gives us avaule less than target we will serach left side fi teh array and divid again. if n/2 give sus right side of teh array we ill divid ans serahc rigth side of te array. 
    
     */
    public int search(int[] nums, int target) {

int start=0;
int end= nums.length-1;
     

while(start<=end){
      int middle= start + (end- start)/2;
    if(nums[middle]== target){
        return middle;
    }
    else if(nums[middle]> target){
        //bascially shrinking it 
        end= middle -1; 
    }else if( nums[middle]<target){
        //shrking it 
          start =middle +1;
    } 



}
  return -1;  
}
}