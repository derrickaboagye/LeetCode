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

 /* Inutuion: we are given a linked list, with odd and even nodes, we must group the odd indices togther followed by the nodes with even nodes. and return the reordered list

 Apporach: 
 We have a linke dlist and we must retrn the odd and even indeices.Since our head is at indecies 1 whihc is odd. head will keep trakc of all the odd indices. To get to the next odd indcies, we will do. Head.next.next. This will run for the whole linked list. To get even indices we will set head.next to even since it will be in idncices 2. we will also set a evenhead at indcies 2 as well. so we can return it later alsong with oddhead(head).  
 
 
  */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        //if empty
        if(head == null){
            return head;
        }

        ListNode odd= head;
        ListNode even= head.next;
//this sets as a head for even so we can return later on doenst have to follow even when it traverses.
        ListNode evenhead= even;

        //traverse 
        //while loop syays that as long as there are elements in the even nodes we are god. 
        while(even !=null && even.next !=null ){
            odd.next= odd.next.next;
            odd= odd.next;
            even.next= even.next.next;
            even= even.next;
            
        }


//joinng them 
        
        
            odd.next = evenhead;
        
        
        return head; 
        
        
    }
}