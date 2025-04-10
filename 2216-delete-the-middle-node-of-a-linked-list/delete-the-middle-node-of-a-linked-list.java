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


 /* Inutuion: Here we are given a linkeldist and we must delet the middle node and retunr the head of the modfifed Linked list.

 Apporach> we will use two pointers. Both will start at head and one will move 2x the speed of the other. when teh aftser one gets to the end/null we kno wthat we have reche dthe end and also found the middle, which the slow pointer will be pointing too.
 We will then return the new LinkedList
 
  */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
 
 if (head == null || head.next == null) {
            return null;
        }
 //set both to head
        ListNode fastpointer= head;
        ListNode slowpointer= head;
        ListNode prev= null;


        while(fastpointer != null && fastpointer.next != null){
            //traversal
            fastpointer= fastpointer.next.next;
            prev=slowpointer;
            slowpointer= slowpointer.next;
        


        }


          prev.next=slowpointer.next; 

        return head;
        
    }
}