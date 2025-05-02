class Solution {
    /**
   Inution: we are given a string of opperations and the intial vaule of x is 0.
    - ++x and X++ will increment x by 1
    - --X and X-- will decrement x by 1.

 Aproach: we will read the string and perform each operation on x and return the vaule of x. 
 we will have our intial vaule of x set to 0. we will loop through the stirng array. 
 -if we ecounter ++x or X++ we will incrment x by one
 -else if we see --X and X-- we will decrement x by 1.


    
    
     */
    public int finalValueAfterOperations(String[] operations) {
            

             int x=0;
    
           for(int i=0; i< operations.length; i++){
              
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x++;
            } else if(operations[i].equals("--X") || operations[i].equals("X--")){
                x--;
            }

           }
return x;
  
    }
    
}