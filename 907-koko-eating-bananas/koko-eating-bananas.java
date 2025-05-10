class Solution {
    /**
    we know that  the leats banaas koko can eat is 1 and the max number she cna eat is the max number in the array.

    here we woll perfomr binary search
    [30,11,23,4,20]
     S           E. //find mid point = 23 ehich will be proces[mid];
     we find the sum of each element with k being 3 and check if it is greater than or eaul to h. if so we move our End pointer, else we move our start pointer untill both have meet at the middle.
     */
    public int minEatingSpeed(int[] piles, int h) {

        //max vaue in piles to start for lower boudn of binary search
        int max=piles[0];
        for(int i=0; i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        
        //binary search
        int start=1;
        int end= max;
        
        while(start<=end){
            int mid= start + (end- start)/2;
            //here we will use mid to find the sum of each apporach
            int k= mid;
            int sum=0;
            for(int pile: piles){
               sum+= Math.ceil((double)pile/k);
            }
            if(sum>h){
                start= mid+1;
    
            } else {
                end=mid-1;
                
            }
        }
return start;
        
    }
}