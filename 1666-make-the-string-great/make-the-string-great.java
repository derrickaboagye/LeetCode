class Solution {

    /*goal is to remove adjacnt chacarts that are uper case and lower case.
    what is. abad pair?
    -two adjacent letters
    -once lowercase and another is upper case

    as we keep counign elemts form right to left. we remove any two(undo) form the senctes.
    this shoudl point to a stack DS 
    -since we remove a new pair it can also cause a bad pair so we need to remove it.
    
    
    */
   public String makeGood(String s) {

    // Make our stack 
    Stack<Character> stacky = new Stack<>();

    // Loop through the string
    for (int i = 0; i < s.length(); i++) {
        char current = s.charAt(i);

        if (!stacky.isEmpty()) {
            char top = stacky.peek();
            // Check for bad pair using ASCII difference
            if (Math.abs(top - current) == 32) {
                stacky.pop(); // Remove the bad pair
                continue;     // Skip pushing current
            }
        }

        stacky.push(current); // Add current char if no bad pair
    }

    // Convert stack to string using s sring builder
    StringBuilder sb = new StringBuilder();
    for (char c : stacky) {
        sb.append(c);
    }

    return sb.toString();
}

}