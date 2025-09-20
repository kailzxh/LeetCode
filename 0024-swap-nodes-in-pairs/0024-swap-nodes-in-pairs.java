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
    public ListNode swapPairs(ListNode head) {
        if(head==null)return null;
        ListNode dummy = new ListNode(0);
        dummy.next= head;
        ListNode prev= dummy;

        
        while(head!=null && head.next!=null){
           ListNode temp = head;
           ListNode temp2=head.next;

            prev.next = temp2;
            temp.next = temp2.next;
            temp2.next = temp;

            prev = temp;
            head = temp.next;
           
        }
    return dummy.next;}
}