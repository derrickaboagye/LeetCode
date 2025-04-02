class Solution {
    /*Inution: given a string s. which conatisn starts "*", we must move th closetd non-star charcter to its left, as well ad removing the str itself.


    Approach: we will use a stack. We will inseert elements as we traver the string. Rather then populating the whole stack with the string at once. This allows for flexiablity when dealing with the stack. (LIFO). As we insternt elemenst in the stack. Once we encounter a star we will, pop the last element in our stack. Poping and insetring for a stack will be O(1).  
    
    
    */
    public String removeStars(String s) {
        

        //create our stack

        Stack <Character > Stack= new Stack<>();

//s.toCharAwway because s is a string and we wnat characters.
        for(Character ch: s.toCharArray()){
            if(ch == '*'){
                if(!Stack.isEmpty()){ //check if empty beofore we pop if not we will get a runtime
                Stack.pop();}
            }else
            Stack.push(ch);
        }

//convert our stakc back to a string.
StringBuilder result= new StringBuilder();
while(!Stack.isEmpty()){
    result.insert(0, Stack.pop());
}
      return result.toString();
    } 

}