class Solution {
    /** find the square root of a number and round down without using a built in fuction 
    
    .Approch 1: Since we know that a square root is a number times a number. if we are given x and it is not a neagative number. we can check vaule sof 1 to x. and for each check we can muiltpky the number by itsel to see if it equals x or greater than x. we do i-1 if so we round down, if not we keep moving to the next number '
    
    
    x=4
    1*1=1 //is 4<=1
    2*2=4 //is 4<=4 yes we return 2

    x=8
    1*1=2 
    2*2=4
    3*3=6
    4*4=16
    */
    public int mySqrt(int x) {

        if(x==0){
            return 0;
        }
           for(int i=1; i<=x ;i++){
            long square= (long) i*i;
            if(square ==x){
                return i;
            } else if (square>x){
                return i-1;
            } 

           }

return x;
    }
}