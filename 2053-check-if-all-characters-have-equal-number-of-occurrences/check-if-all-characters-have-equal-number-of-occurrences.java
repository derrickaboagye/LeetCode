class Solution {

    /**
    Inutuon: we are given a string array and we must return true of it is a good string and flase otherwise
    _ a good string is a string that alla characters appear once.

    Apporach: we need ot trakc the type of caracter and the number of occuranes it has. Hashmap store vaule and frequeincy with the vuales. we check if the frqueinces in our map ar the same. if so we return true. if not we return fale.
    
     */
   public boolean areOccurrencesEqual(String s) {
    // Step 1: Create a HashMap to store frequency of characters
    HashMap<Character, Integer> frequencyMap = new HashMap<>();
    
    // Step 2: Iterate through the string and count the occurrences of each character
    for (char ch : s.toCharArray()) {
        frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }
    
    // Step 3: Get the frequency of the first character
    int firstFrequency = frequencyMap.values().iterator().next();
    
    // Step 4: Check if all frequencies are the same
    for (int frequency : frequencyMap.values()) {
        if (frequency != firstFrequency) {
            return false; // If any frequency doesn't match, return false
        }
    }
    
    return true; // All characters have the same frequency, return true
}
}
