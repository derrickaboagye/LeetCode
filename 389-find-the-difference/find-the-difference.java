class Solution {
    /**

    Inutuon: we are given s and t as string. But t is made by shuffleing s and adding a random character at a random postion
    We must find the lette rthat was added to t.
    
    apporach: We need a structure to store the stign s. SHufflign wont matter because if we shuffle the stirctre will stillhold the amount of acharcters that we had in s. We will comapre the characters in s to the characters in t. 
    The rewaosn wy a array list wont work here is because in aarray list. we willhave to check each element whichis O(n).
    However, if we use a hashmap. we can populat ethe map and check for the charcters with the one frwuwncy. 
    
    //wuick rwacape. we are putting charcter sin out hashmap from string s and we are checkign the map to see which number is not in the 
     */
    public char findTheDifference(String s, String t) {
    // Make our hashmap
    HashMap<Character, Integer> hashy = new HashMap<>();
    
    for (char c : s.toCharArray()) {
        hashy.put(c, hashy.getOrDefault(c, 0) + 1);
    }


    for(char c: t.toCharArray()){
        if(!hashy.containsKey(c)){
            return c;
        } else {
            hashy.put(c, hashy.get(c)-1);
            if(hashy.get(c)<0){
                return c;
            }
        }
    }






    return ' '; // just to satisfy return requirement (you can change this based on logic)
}
}