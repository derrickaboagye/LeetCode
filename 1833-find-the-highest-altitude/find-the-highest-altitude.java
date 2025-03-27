class Solution {

    /* Intution: they have a list of numbers. each number represents how high you climb or descend a mountain.

so if you have [1,-1,1]

it's like saying, go up 1, go down 1, go up 1.

so the question is asking, with all of these "climbs", at which point are you at the highest altitude (height)
//so in simpel we are given a array. our start vaule is 0. we must peroform operations as we mtravse the array and keep track of our max attidue and return it.\


Appraoch: We wil have variables; startingvaule, highestalt, currentalt.
We will trvase teh array. so (0)+(-5)=currentalt. we add current alt to gain[i]. we check if the currentalt is greater than the onw we have. if so we set it to the current altidue. 
*/
    public int largestAltitude(int[] gain) {

  int highestalt=0;
        int currentalt=0;
        

        for(int i=0; i<gain.length;i++){
           
           
            currentalt += gain[i]; 
            highestalt= Math.max(highestalt, currentalt);

             
        }

         return highestalt;
    }

}