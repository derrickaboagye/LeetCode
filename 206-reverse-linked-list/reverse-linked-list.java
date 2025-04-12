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

class Solution {
    public ListNode reverseList(ListNode head) {


//base case 

if(head == null){
    return head;
}
        Stack<Integer> stacky= new Stack <>();
      //populate our stack with elemenst form linke dlist

      while(head != null){
stacky.push(head.val);
head= head.next;

      }
 //makign node for new list
 ListNode reversedList = new ListNode(Integer.MIN_VALUE); // correct constant
 ListNode pointer= reversedList;

 //pop elemets in our stack
 while(!stacky.isEmpty()){
      pointer.next= new ListNode(stacky.pop());
      pointer= pointer.next;
    

 }

 //reverselist.next cause we already have the first vaule set to a int.min so we want other next vaules
return reversedList.next;

        
    }
}