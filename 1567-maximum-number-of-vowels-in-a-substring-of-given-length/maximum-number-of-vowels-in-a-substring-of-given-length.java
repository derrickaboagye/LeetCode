class Solution {

    /* Inutuion: we are given a string s and a integer k, withing the string s we must find a substring of length k.In which we will find the number of vowls in the substring.
    
    
    
    Apporach: We will use a fixed sliding window. We will find the number of max vowls in each widnoe. We will slide the window accros the length oif the string. Keppign count of ech max voul and updating a max vowel variable as we traverse. 

    //we are moving our window anbd if elemnt on right is a vowl we increase coutn if element of the left is a vowel we descrease count. 
    
    Time compolixty: o(n-k)
    space complixtyu: O(n) */ 

    public int maxVowels(String s, int k) {
        //store charcters in a hash set 


//counting tracking varabales
int vowelcount =0;
int maxvc=0;
//add cowels to as set becasue lookup time is O(1)
        Set<Character> set= new HashSet<>();
          set.add('a');
          set.add('e');
          set.add('i');
          set.add('o');
          set.add('u');
   
   //find vowels in first fixed window of length k. 


   for(int i=0; i<k; i++){
    if(set.contains(s.charAt(i))){
        vowelcount++;
    }
   }
   maxvc= vowelcount;

   //sldie the window 
   for(int i=k; i<s.length();i++){
    if(set.contains(s.charAt(i))){
        vowelcount++;
    }
    if(set.contains(s.charAt(i-k))){
    vowelcount--;
   }
maxvc= Math.max(maxvc, vowelcount);
   } 


return maxvc;
    }
    
}