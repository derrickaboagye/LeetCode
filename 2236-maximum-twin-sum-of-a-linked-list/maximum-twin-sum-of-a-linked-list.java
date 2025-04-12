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


 /**
Inutuon: Pair up nodes in a special way — each node is "twinned" with another node in the list.

The way twins are matched is:
The 1st node (index 0) is paired with the last node (index n-1).
The 2nd node (index 1) is paired with the second-to-last node (index n-2), and so on.
For every twin pair, calculate the sum of their values.Find the biggest (maximum) twin sum.

Approach: Use the slow and fast pointer method to reach the middle of the list.
slow moves one step at a time.
fast moves two steps at a time.
When fast reaches the end, slow will be at the midpoint.
Reverse the first half of the linked list while moving to the midpoint.
This way, when you reach the middle, you'll have the first half reversed and the second half untouched.
Now start from two points:
One pointer at the start of the reversed first half.
Another pointer at the start of the second half (where slow ended up).
Traverse both halves together, one step at a time:
At each step, add the values from both pointers (twin sum)
Keep track of the maximum twin sum found.Return the maximum twin sum.
 
 
 
  */
class Solution {
    public int pairSum(ListNode head) {
        
        if (head == null || head.next == null) {
            return 0;
        }

 ListNode slow= head;
 ListNode fast=head;
 ListNode prev= null;

 while(fast != null && fast.next != null){
    fast= fast.next.next;


    //reverse 
    ListNode nextslow= slow.next;
    slow.next = prev;
    prev= slow;
    slow=nextslow;
 }

 int maxsum=0;

 while(slow !=null){
    int sum= slow.val + prev.val;
    maxsum= Math.max(sum, maxsum);
    slow= slow.next;
    prev= prev.next;
 }



        return maxsum; 



    }
}