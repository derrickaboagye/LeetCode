class Solution {
    /*
    Inuition: Here we are given the a int array tickest of lenth n. the numer of tickest thate the ith person would like ot buy is tickets[i]. Each person takes 1 secnonf to buy a ticket. A person can only buy 1 ticket at a time and has to go to the bakc of the line to buy more tickets. fithe perosn doe snot have anytickets left ti buy th person will leavethe line.
    return the time takne for the 
    

    Approach: We will have a queue that willo holod the idnex of the ticktes beacuse we wnat to process the number of peopel?
    We will have a var called seconds that weill keep track of secdons for each ticket bought per person.
    We will traverse thentickest array.
    
    
     */
    public int timeRequiredToBuy(int[] tickets, int k) {
         //qeueue is a imnterface so we must use Linkedlist to implment it 
        Queue<Integer> peopleline= new LinkedList<>();

        //populate queue with size of ticktes array
        for(int i=0; i<tickets.length;i++){
            peopleline.offer(i);
        }

     int seconds=0;

     while(!peopleline.isEmpty()){
        seconds++;

        int front= peopleline.poll();
        tickets[front]--;

        if(k==front && tickets[front]==0){
            //if our person reaches top of line and that vaule is 0 we have return and bougth all tickets 
            return seconds;
        }
         //since we are not done we insert back into teh queue 
        if(tickets[front]!=0 ){
            peopleline.offer(front);
        }
     }
return seconds; 

        
    }
}