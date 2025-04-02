class Solution {

    /*Inutuion: we are given. a n*n integer matrix and we hae to see whoch columns have the same vuales as rows. 
    
    Apporach: we will use a dictionary, to store our rows and freq count.
    // exmp: 3122:1
             1445:1
             2422:2

        then we will need to find our coulme count as well. To do so we fill firn dthe trasnpose of the matrix(flipping rows ot coulumns)
        twe will have a ocunt var. Anytime we traverse our tranpose mtarix(our flipped version from rows to coulmn) we can increas ethe count once we encoutner a similar row. 
            

Time complixty: O(n^2) becaue of our nested loop
     */
    public int equalPairs(int[][] grid) {


//create a hashmap. key will be a string and vaule will be a Integer. 
HashMap<String, Integer> rowCount= new HashMap<>();
//HashMap<List<Integer>, Integer> rowCount = new HashMap<>();

//populate our hashmap with rows
for(int i=0; i<grid.length; i++){
    //bc we converted key to string we need our row keys in a string too
    String rowkey= Arrays.toString(grid[i]);
    rowCount.put( rowkey, rowCount.getOrDefault(rowkey, 0 ) +1);
}

int count=0;
for (int j = 0; j < grid.length; j++) {
            int[] col = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                col[i] = grid[i][j]; // Extract column
            }

            String colkey= Arrays.toString(col);

            if(rowCount.containsKey(colkey)){
                count+= rowCount.get(colkey)
                ;
            }

        
    }
    return count;
}
}

