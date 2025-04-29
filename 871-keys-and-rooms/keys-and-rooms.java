class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //boolean to hold rooms visted //.size() cuase its a list
        boolean [] seen= new boolean[rooms.size()];
        //set first room to seen cause it is open
        seen[0]=true;

        //stack to keep trakc of keys
        Stack<Integer> stacky= new Stack<>();
        //add first room keys to stack
        stacky.add(0);
        //while loop to process elements
        while(!stacky.isEmpty()){
            //curr will hold curr keys we are on
            int curr= stacky.pop();
            //for each loop to loop through key vaules in curr
            for(int new_key: rooms.get(curr)){
                if(!seen[new_key]){
                    seen[new_key]=true;
                    stacky.add(new_key);
                }
            }        
            }
            //check if we visted everyroom yet if not return false.
            for(Boolean visted: seen){
                if(!visted){
                    return false;
                }
            }        

return true;
        
    }
}