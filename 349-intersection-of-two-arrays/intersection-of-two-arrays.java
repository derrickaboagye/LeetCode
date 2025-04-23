class Solution {
    /**
    I: we are given two array and we must return an array o fthier instertions
    -The set of elments that are prenste in both, result must be unique and can be retured in any order.

    //We can put elemets form nums1 into a hashset. we will loop throught nums2 and check if it is in the ahsset. if it is we will add it to out array, and remove it if not we skip over it. then we return out array.
    we will check if the 

    set1<4,9,5>. <5,8>
    
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashy= new HashSet<>();
        //list to store vaules then convert to [] because method return type is a [].
        //reason why we coudnt use a int array is because we didnt know the size before hand
        List<Integer> listy= new ArrayList<>();
        for(int i=0; i<nums1.length;i++){
            hashy.add(nums1[i]);
        }

//looping through the second nums array and adding it to ans if it exist and removing it.
          for(int i=0; i<nums2.length;i++){
            if(hashy.contains(nums2[i]))
                  listy.add(nums2[i]);
                  hashy.remove(nums2[i]);
          } 

     //convert list to array
     int [] ans= new int [listy.size()];
     for(int i=0; i<listy.size();i++){
        ans[i]= listy.get(i);
     }
        return ans;   
    }


}