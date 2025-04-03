class Solution {
    /* Given a int array of astroids
    -the idncies ofthe ateriod represent thier postion in space [5,10,-5]. 5 is o, 10 is 1 , etc
    -the vuales at asteroids[i] is the size. [5,10,-5]. the 2 asteriod has a size of 5
    -the sign at the given position shows the direction of the asteriods 

    Goal: find out the state of the asteriod after collison. 
    -If two asteriod meet, the smaller one will collide.
    -if same size both will collide
    -two atriods moving in smae direction(same sightin )will never meet.

    Approach: we will use a stack. we will insert elemenst from Ateriod into the stack. we will push first int. we will check if the next elemnt being pushed is smaller we will pop it. if it is equal we will remove the last two lements. 
     */
     public int[] asteroidCollision(int[] asteroids) {
        //make new stack 
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Process the current asteroid
            boolean destroyed = false;
           //check while thestackis not empty an dthe current asteriod is moving right(greater than 0) an dthe top of the stakc is moving left(less than zero) a collisonwill happend. In that case we will.
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                //var to store top of stacl
                int top = stack.peek();
                 //if current asterios id bigger than top of stck we destory smaller. so we pop
                if (Math.abs(asteroid) > top) {
                    stack.pop(); // Top asteroid gets destroyed
                    //if it is the same vaule both gets destpryed
                } else if (Math.abs(asteroid) == top) {
                    stack.pop(); // Both asteroids destroy each other
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array and retun array 
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}