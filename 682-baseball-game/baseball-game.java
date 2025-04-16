class Solution {

    /**
    Intution: We are given score for a game. we start with a emptu score
    there are rules ee must apple to get to a final score.
    Apporach: since we will be removing and adding elemets we will use a stac. once we arrive at our key vaules; exp wethaer integer, , D, C. we will perform the coressponding application to it.
    TIme complxity: O(n),we are just trvaerseing the string array once.
    Space complity;0(n), because we are using a stack to store and do opperation on our elements
    
    */
    public int calPoints(String[] operations) {

//Make our stack
Stack<Integer> stacky= new Stack<>();
//for each loop 
for(String vaule: operations){
    if(vaule.equals("+")){
        int first= stacky.pop();
        int second= stacky.peek();
        stacky.push(first);
        stacky.push(first + second);

    } else if(vaule.equals("D")){
       // stacky.psuh(stacky.peek()*2)
        int peek= stacky.peek();
        stacky.push(peek *2);
    } else if(vaule.equals("C")){
           stacky.pop();
    } else {
        //else make the strign a int 
        stacky.push(Integer.parseInt(vaule));
    }
}
    //sum all the elemets in teh stack
    int max=0;
    while(!stacky.isEmpty()){
        //pop all elemenst and add them togther
        
        max+=stacky.pop();

    }
     return max;
}
    

    }

