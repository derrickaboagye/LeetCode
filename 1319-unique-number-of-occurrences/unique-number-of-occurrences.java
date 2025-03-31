class Solution {


    /*
    Inution: we are given a arr of intgers. We must return true if the # of occurnaces of each vuale in the array is unqiue and flase if not. sp bacily the number of occuances for each has to be uqique


    Apporach: We can store elemest in arr into a hashmap <vaule, frequincey> . Then we will hceck if fequincy are uniqwe we return true else false.


    Time compplixty: O(n), since we are trvaering the array once to populate the hashmap
    Space complixty: O(n). because we used a hashmap
    
    
     */
    public boolean uniqueOccurrences(int[] arr) {
        //hashmap
   HashMap<Integer, Integer> hashy = new HashMap<>();

  //populate has map with vuales and occurnaes
   for(int i=0; i<arr.length;i++){
    hashy.put(arr[i], hashy.getOrDefault(arr[i], 0)+1 );
   }
        //check if occurnaces are uique. To do so we need a hashset 

        Set<Integer> hashset= new HashSet<>();
        for(int num: hashy.values()){
            if(!hashset.add(num)){
                return false; // beasue its mot unique 
            }
        }
           
        
    return true; //because it is unique


        
    }
}
