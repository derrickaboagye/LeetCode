class Solution {

    /**Inutuion: given a non empty nums array. we ,iust find elements that sppear twice. However one elemnet appears only once find that elemen/
    
     Apporach: here we will use a hashmap. we will pair each vuales(key) with a frequeincy(count). count. we will then check if the elemenst are less than 2,we will return it vaule
     
     */
    //<Vaule, frequency>
   public int singleNumber(int[] nums) {
    //make our hashmap

    HashMap<Integer, Integer> hashy= new HashMap<>();
    //loop through nums adding numbers in hahsy as we go
    for(int i=0; i<nums.length;i++){
        hashy.put(nums[i],hashy.getOrDefault(nums[i],0)+1);
    }
    //traverse th ekey set and find vaules less than 2 and return its vaule.
    for(Map.Entry<Integer, Integer> entry: hashy.entrySet()){
        if(entry.getValue() == 1){
            return entry.getKey();
        }

       

    }
     return -1;
}
}