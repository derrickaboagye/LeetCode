class Solution {

    /* Intution: we are given two strings and me must check if they are close by 
    1.swappoing anytwo esting charcters
    2.Swapping occrances of each charcters.

    to do so we must keep some requirment sin mind: 
    -Lengths must be the same becaus eif not it violates operatione 1. We cnat swap esisting charcters if the lenthgs are dffernet
    -Charcters must be the same but same charcters. word1= abc, word2=cba,
    NOT: word1=abc word2=osp

    -Frequiency. we need the same frequency for the charcters we are working with.


Apporach: We will use a hashmap. <chaarcter, frequency> . we will have two maps for  each word. Will will put charcters in each words string into thier respected hashmap. Then we will check if frequences ar ethe same in both maps. if so we can say the words are close beause it sastisys opertaion 1? 
    
     */
    public boolean closeStrings(String word1, String word2) {

        //base case if word1 is nto the same length as word2 it violaites both oprtations

        if(word1.length() != word2.length()){
            return false;
        }


        HashMap <Character, Integer> word1hashy= new HashMap<>();
        HashMap <Character, Integer> word2hashy= new HashMap<>();

         //populte word1hashy
        for(char c: word1.toCharArray()){
            word1hashy.put(c, word1hashy.getOrDefault(c, 0) + 1);
        }

//populate word2hashy
for(char c: word2.toCharArray()){
            word2hashy.put(c, word2hashy.getOrDefault(c, 0) + 1);
        }

//chekc if btoh words have the same characters we use .keyset()

if (!word1hashy.keySet().equals(word2hashy.keySet())) {
    return false;
}

//compare frequency. just pass the frquences with are in vaules of the map in a list. 

List<Integer> wordl1= new ArrayList<>(word1hashy.values());
List<Integer> wordl2= new ArrayList<> (word2hashy.values());

//sort list then comapre if the are equal 
Collections.sort(wordl1);
Collections.sort(wordl2);

        return wordl1.equals(wordl2);

}
}