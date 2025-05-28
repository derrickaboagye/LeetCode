class Solution {/**we can make a hashmap and store reach char with thier freq. then we chekc if chars in a does not mathc t  */
    public boolean isAnagram(String s, String t) {
        //make hashmap for s and t
          if (s.length() != t.length()) return false;

        HashMap<Character, Integer> smap= new HashMap<>();
         HashMap<Character, Integer> tmap= new HashMap<>();

            for(int i=0; i<s.length();i++){
                char c1= s.charAt(i);
                char c2= t.charAt(i);
                smap.put(c1,  smap.getOrDefault(c1,0)+1);
                 tmap.put(c2, tmap.getOrDefault(c2, 0) + 1);
            }

            return smap.equals(tmap);
    }
}