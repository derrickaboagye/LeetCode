class Solution {

    /**
    I: Given and adj matric of n*m. find the providenece of each matrix. A providence is given when vertes are connetced and no other cities outside are connected wiht it 

    A: approach will be to look at each start of the matrix 
    [1,1,0]:0
    [1,1,0]:1
    [0,0,1]:3

    we will firts had a variable that will hodl count of number of providences. 
    We will check first node, which we will also consider our strat of a providence. We will have a list that holds vissted. We will vists our first node. and then perofrm DFS. on that node(looking at other neighbors that are attached to the head node.) once we find other neighboors we add them to the vistsed array. once the DFS is complete we will increment our varaible to hold count of number of providneces.?

     */
    public int findCircleNum(int[][] isConnected) {

       int length= isConnected.length;
       int count=0;
       boolean [] visted = new boolean[length];

       for(int i=0; i<length; i++){
        if(!visted[i]){
            dfs(isConnected, visted, i); 
            count ++;
        }
       
       }
        return count;
        
    }

       private void dfs(int [][] graph, boolean[] visted, int node){
        //the firts node will be set to true since we are visting it 
              visted[node]= true;
            
    
              //loop through every our current node;
              for(int i=0; i<graph.length; i++){
                //if they ar eneighborrs and if the neighboor(i) is not visted yet
                if(graph[node][i]==1 && !visted[i]){
                  //call dfs
                  dfs(graph,visted,i);
                }
              } 


       }


}