class Solution {
    /** to return the nuber of strings in each atring array that appears excally once. 
    store eahc string and check if the string appears once in each of the arrays 
    if the stirng appears once and is in both strinsg
    ipuuitng eahc strign and freq coutn in a hashmap,
    -chekcing each haspmap(having) to see it vaule is 1 in both maps and if the keys also exist on both maps*/
    
    public int countWords(String[] words1, String[] words2) {
        //make hashmap 1
        HashMap<String, Integer> hash1= new HashMap<>();
        //hashmap 2
        HashMap<String, Integer> hash2= new HashMap<>();

        //populayte hash 1
        for(int i=0;i<words1.length;i++){
            hash1.put(words1[i],hash1.getOrDefault(words1[i],0)+1);
        }
        //populate hash 2
        for(int j=0;j<words2.length;j++){
            hash2.put(words2[j],hash2.getOrDefault(words2[j],0)+1);
        }


int count=0;
for(String c: hash1.keySet()){
    if(hash1.get(c)==1 && hash2.getOrDefault(c,0)==1){
        count++;
    }
}
        //check if each key is in both maps and vaule sare set to 1 and incrment count ;
        
return count;
    }
}