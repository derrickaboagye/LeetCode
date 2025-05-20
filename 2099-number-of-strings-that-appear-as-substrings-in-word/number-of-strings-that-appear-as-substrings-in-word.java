class Solution {
    /** Given an string patterns and string word, return the number of styrings patterns that exist as a substring in word. 
    A:Here we ill loop through the patterns string and check if word strings coatins anusybstrings using java .contains method
    . */
    public int numOfStrings(String[] patterns, String word) {


int count =0;
        for(String e: patterns){
            if(word.contains(e)){
          count++;
            }
        }
        return count;
    }
}