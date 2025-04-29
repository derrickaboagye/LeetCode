class Solution {
  /**  Make a result array that’s the same as prices. This way you always have something to return.

Loop through each item from left to right.

For each item:

Look at every price after it.

As soon as you find one that’s less than or equal to the current one, subtract it.

Once you subtract, you’re done with this item — break out of the inner loop.

Go to the next item and repeat 
I: we are given a array of prices[i], where the vaule of each prices is the i'th index. a discount is applied when we find the next smallets number and subrtarcat it form the ith number we are at

A: we will use two pointers one at i and another at j. J will find the pointer that is less than I and will subtarct it.*/


    public int[] finalPrices(int[] prices) {
       
  
       //this will hold prices [] length
        int n= prices.length;
             //this will store our res vaule
       int [] res= new int [n];
      //[8,4,6,2,3]
      //[]
       for(int i=0; i<n; i++){
        res[i]=prices[i];
        for(int j=i+1; j<n; j++){
            if(prices[j]<=prices[i]){
                res[i]= prices[i]-prices[j];
                //break bacsue we dont wantt to keep check other items
                break;
     
            }
        }
       }
       return res;
    }
}