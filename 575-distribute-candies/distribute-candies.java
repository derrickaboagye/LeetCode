class Solution {
/** 
A: Alica is given a numbe rof candies.however she can only eat n/2 amount. where n is teh totoal number of candies. Each canide has a tupe. return teh maxuim number of candies she can eat, of she eats n/2.

I: inutuion here is to first find the toal amoount she candies she can eat. Which willbe (n/2).
Then we can find the uniqeue candies she cna eat so we put candytype array into a set. 
we will find the max for both var then return??

 */
    public int distributeCandies(int[] candyType) {

        int allowedtoeat= candyType.length/2;
        

        Set<Integer> setty= new HashSet<>();
        for(int x: candyType){
            setty.add(x);
        }
        int difftypes= setty.size();
        int min= Math.min(allowedtoeat, difftypes);

        return min;
    }
}