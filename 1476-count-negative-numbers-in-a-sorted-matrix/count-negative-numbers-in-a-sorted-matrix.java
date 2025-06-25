class Solution {
    /**
    4, 3, 2, -1
    3, 2, 1, -1
    1, 1,-1, -2
    -1,-1,-2,-3
    
    one soultion is to use a double loop and check if a number is negative. 
    Have anothe rvaraibale called neg to hold count of every negative number we see. then we return neg at the end of everything. 
    
     */
    public int countNegatives(int[][] grid) {

        int neg=0;

     for(int i=0; i< grid.length;i++){
        for(int j=0; j<grid[0].length;j++){
            if(grid[i][j]<0){
                neg++;
            }
        }
     }

     return neg;


        
    }
}