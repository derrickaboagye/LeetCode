class Solution {
    /** we an use a set. if the vaule sare the sam ein nums and we plug the vaules in a set. the lemgth of teh set and nums should be the dame. If they are the sam ethen we return flse(its distinc) else we return true(<1). 
    time complixty: O(n)
    space complity: O(n)*/
    public boolean containsDuplicate(int[] nums) {

        //make our set 
        Set<Integer> setty= new HashSet<>();
        int numslen= nums.length;

        //load nums into set
        for(int i=0; i<nums.length;i++){
            setty.add(nums[i]);
        }
        int settysize= setty.size();

        if(numslen == settysize){
            return false;}
            else {
                return true;
            }
        
        
    }
}