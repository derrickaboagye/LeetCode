class Solution {
    /** Inution: we are given a string s and we must return the index of the first non repating character in sting. 
    
    Apporach: Approach: 
     We will use a HashMap to store characters from string `s` along with their frequency.
     Characters with a frequency equal to 1 are non-repeating.
     Since we are looking for the first non-repeating character, we will 
     check the string from left to right and return the index of the first 
     character with frequency 1. If none is found, return -1.

     Time Complexity: O(n), where n is the number of elements in the string.
     Space Complexity: O(n), where n is the number of unique characters stored in the HashMap.p
         */
    public int firstUniqChar(String s) {
        //making our hashmap
        
        HashMap<Character, Integer> map= new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
 //here if the first vaule in our map is less than 0 we will return its indeice
        for(int i=0;i<s.length();i++){
            /**s.charAt(i) → Looks at the character at index i in string s.

map.get(...) → Retrieves the frequency value for that character from the map.

== 1 → Compares that frequency to see if it’s exactly 1, meaning the character is non-repeating.

 */
            if(map.get(s.charAt(i)) ==1){
                 return i;
            }
        }
        return -1;
    }
}