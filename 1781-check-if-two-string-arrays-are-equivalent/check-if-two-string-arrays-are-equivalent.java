class Solution {

    /** the sare teh same fi when cocncated quas the same string
    
    // take array one and cocncate it ans tore it in a stirng and do the sma e with array 2. then coapre both and return the boolen vaile */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

     String words1sum="";
     String words2sum="";
        for(String s: word1){
               words1sum+=s;
        }
        for(String c: word2){
            words2sum+=c;
        }

        return words1sum.equals(words2sum);
        
    }
}