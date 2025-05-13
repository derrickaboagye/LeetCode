class Solution {
    /* s=[1,3,5].  st=[2,4,7] sort they arrays 
and find the differce  st[i]- s[i], add the differe to sum then return sum */
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
         Arrays.sort(students);
         int sum=0;

         for(int i=0;i<students.length;i++){
            sum+= Math.abs(students[i]- seats[i]);

         }
         return sum;
    }
}