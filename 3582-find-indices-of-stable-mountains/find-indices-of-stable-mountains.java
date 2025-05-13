class Solution {
    /**Aprach 1; to have to pointer l and r,check if height[l]>thresshold if so add ot list and return list

    1,2,3,4,5]
        L R
    */
    public List<Integer> stableMountains(int[] height, int threshold) {
         
       List<Integer> listy= new ArrayList<>();
       for(int i=1; i<height.length;i++){
        if(height[i-1]>threshold){
            listy.add(i);
        }
       
       }
       return listy;
}
}