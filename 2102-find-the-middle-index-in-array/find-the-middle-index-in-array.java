class Solution {


    /* Inutuion: we must return the index where the left of the index is equal to the vaules on the righjt of the index(exlusive).

    Apporach: first precualcate the sum of the array and we ill store it in a rightsum varaible. Right us will bve the totoal number we calacuted but minus the idnex vaule we are currently a. The left sum will be indecies that we traved so we add the previouse indecies. we willl use a for loop to check if the right sum is equal to the left sum if so we retunr the index if not we retun -1;


    TIme complixy: O(n): beacuse we used a foor loop to precaualate the sum and anoterh loop (not nested) to check if rigthsum ===left sum.

    space complixty: O(1);
    
    
     */
    public int findMiddleIndex(int[] nums) {

        //precalauate our right sum

        int rightsum=0;
        for(int i=0; i<nums.length;i++){
          rightsum+=nums[i];
}        


int leftsum=0;
for(int i=0; i<nums.length; i++){
     //beacise our right sum becomes the sum we find in out first loop minus the current vaule we are at.
rightsum-=nums[i];
if(rightsum==leftsum){
    return i;

}

leftsum+=nums[i];

}

return -1;

    }
}