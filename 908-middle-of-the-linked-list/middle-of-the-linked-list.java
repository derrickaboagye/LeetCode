/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 /*Inutuion: we are given a linkedList and we must return the middle element 
 
 
 Approach: we will use the two pointer method. We will have both pointers and the head node. names are; slow & fast. We will have the fast pointer move 2x as the slow pointer.Once the fats pointe rgets to the end of the linked list, teh slow pointer will be at the middle of the link list. We then return the middle node 
 
 Time complity (O)^2. we will have to loops/
 pointer?  */
class Solution {
    public ListNode middleNode(ListNode head) {
    
    //set both pointers to head 
        ListNode slowpnt= head;
        ListNode fastpnt= head;


  //we will keep moving while the fastpointer hasnt hit null yet.
  while(fastpnt != null && fastpnt.next!= null){
        fastpnt= fastpnt.next.next; //moves 2x as speed
       slowpnt= slowpnt.next;   //moves half the speed 
    }

    return slowpnt; 
}}