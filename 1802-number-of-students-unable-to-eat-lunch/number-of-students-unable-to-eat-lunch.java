class Solution {
/*Intuition:
We're given two integer arrays: `students` and `sandwiches`.

- Each student has a preference:
    - 0 → likes circular sandwiches
    - 1 → likes square sandwiches
- Sandwiches are stacked (index 0 is the top sandwich).
- Students are in a line (index 0 is front of the line).

Rules:
1. If the first student in line likes the top sandwich, they both leave.
2. If not, the student moves to the end of the line, and the sandwich stays.

Approach:
Since we’re dealing with a line where students can be pushed to the back, a **queue** is perfect for this.

Steps:
- Put all students into a queue.
- Iterate through the sandwiches list.
- For each sandwich:
    - Check if the student at the front likes it.
        - If yes → remove student and sandwich.
        - If no → move the student to the back.
    - Keep track of how many students in a row have refused the sandwich.
        - If all students have refused it → stop, return how many students are left.

        //only studnets get put in queue beacus ethy have to move to bakc of line unlike sandwhiches which only gets removes. 

Time Complexity:  
- **Worst case O(n^2)** because in the worst scenario, each student could rotate through the queue for every sandwich.

Space Complexity:  
- **O(n)** because we use a queue to store up to `n` students.
 
*/

//deqeue = poll()
//enequeu= offer()
    public int countStudents(int[] students, int[] sandwiches) {
        
        //remeber queue are interfaces so we implement using linked list
    Queue<Integer> stq= new LinkedList<>();

    int count=0;
    int sandcount=0;
    //populate our queue with studnets array
    for(int student : students){
        stq.offer(student);
    }

    while(!stq.isEmpty() && count< stq.size()){
        if(stq.peek()== sandwiches[sandcount]){
            //we found a match
            stq.poll();
            sandcount++;
            count=0;
        } else{
            int backstudnet= stq.poll();
            stq.offer(backstudnet);
            count +=1;

        }
    }

return stq.size();
    }
}