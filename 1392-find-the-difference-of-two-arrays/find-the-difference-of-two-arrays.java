class Solution {

    /* Intution:we are given two arraays. Nums1 and nums2 and we must return a new list called answer  of size 2.
    // list expmt: [ [1,34,4,]. [1,2,3,4,]]
    where answer[0] is distinct vaules in nums 1 which are not in nums 2
    & where answer[1] is distinct vaules in nums 2that are not in nums 1
answer[[2,3,4,4,],[1,23,3,]]
    
    Aporach: disticnt ineteger so it makes sense to use a hashset to store uniqure vaules with no duplicates. 
    we will put echa array into a hashset to hold unqiue vaues. then we will check if any vaule sis in nums1 and not nums2 gets insrted in answer[0], and vaules in nums2 that are not in nums1 gets inserted into vaule answer[1].


    Time Complixty: O(1), checkignvaule sin hashsett is constant 
    
    
    
    
     */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

    

       HashSet<Integer> hashnum1= new HashSet<>();
        HashSet<Integer> hashnum2= new HashSet<>();
       


//populate nums1 into hashnum1
for(int i=0; i<nums1.length;i++){
            hashnum1.add(nums1[i]);

        }

        //populate nums2 into hashnum2
        for(int i=0; i<nums2.length;i++){
            hashnum2.add(nums2[i]);

        }

        List<Integer> List1= new ArrayList<>();
        List<Integer> List2 = new ArrayList<>();

          //logic to find elements in set1 thta are Not in set2
          for( int num: hashnum1){
                  if(!hashnum2.contains(num)){
                    List1.add(num);
                  }
          }


          for(int num: hashnum2){
            if(!hashnum1.contains(num)){
                List2.add(num);
            }
          }

return Arrays.asList(List1,List2);

    }



}