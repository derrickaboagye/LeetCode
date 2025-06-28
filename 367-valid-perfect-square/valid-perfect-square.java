class Solution {
    /** lets image we can use a built in function
    1,2,3,4,5,6,7,8,9,10,11,12
    L   M      R              R
    num==16:
    3*3=9
    6*6=36

    perfec t sqaure only if 
    same (int) * same(int)= num 
    - we will use binary serch to find mid then we will check if mid * mid == num. if mid * mid is greater than num we will move end to mid -1 because we need smaller number 
    we know that binary searhc is when 
    
 */
    public boolean isPerfectSquare(int num) {
        int right=num;
        int left=0;

        while(right >= left){
            int mid= left +(right-left)/2;
           long sqr = (long) mid * mid;
            if(sqr ==num){
                return true;
            }else if(sqr >= num){
                right= mid-1;

            } else {
                left=mid+1;
            }
               }
               return false;
       
}
}