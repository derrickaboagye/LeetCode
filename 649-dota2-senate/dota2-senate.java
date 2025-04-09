class Solution {

    /*
    Intuition:
We are given a string representing a line of senators — 'R' for Radiant and 'D' for Dire. Each senator has the right to do one of two things during their turn:

Ban an opposing party senator (so they can’t act in future rounds).

Declare victory only if all remaining senators belong to their own party.

Approach:
We'll use two queues to keep track of the indices of 'R' and 'D' senators separately. Each queue will hold the positions of the senators in line.

In each round, we compare the front values (the earliest senators) from both queues.

The senator with the smaller index (i.e., who appears earlier in the round) gets to act first and bans the other senator.

The winning senator (the one who acted) is re-added to the back of their queue with a new index: current index + length of the senate string. This simulates the round-based order — after acting, they go to the back of the line for the next round.

The process continues until one of the queues is empty. If radiantQueue is empty, Dire wins. If direQueue is empty, Radiant wins.


    Time complixty: O(n), where n is the number if lemenst in out senetate string.
    Space cimplixty: O(n), where n is the number of elemnts in out queue.
    */
  public String predictPartyVictory(String senate) {
    Queue<Integer> Dq = new LinkedList<>();
    Queue<Integer> Rq = new LinkedList<>();

    // Populate queues with indices
    for (int i = 0; i < senate.length(); i++) {
        if (senate.charAt(i) == 'D') {
            Dq.offer(i);
        } else {
            Rq.offer(i);
        }
    }

    int n = senate.length();

    // Simulate rounds
    while (!Dq.isEmpty() && !Rq.isEmpty()) {
        int dIndex = Dq.poll();
        int rIndex = Rq.poll();

        if (dIndex < rIndex) {
            // D bans R and goes to back of queue with updated index
            Dq.offer(dIndex + n);
        } else {
            // R bans D and goes to back of queue with updated index
            Rq.offer(rIndex + n);

            /*Because the elements are in queues, we always process them in the order they appear in the original string.

First-in, first-out (FIFO) behavior of the queue.

When we poll() from both queues (Dq and Rq), we get the next available senator from each party.

The senator with the smaller index (smaller number) gets to act first, meaning:

They get to ban the other.

They survive and are added to the back of the line by doing index + n.

The other (larger index) senator is banned, so they are not added back into the queue.*/
        }
    }
    
if (Dq.isEmpty()) {
    return "Radiant";
} else {
    return "Dire";
}

}
}