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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
         
        while (l1 != null) {
            str1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            str2.append(l2.val);
            l2 = l2.next;
        }

        
        BigInteger num1 = new BigInteger(str1.toString());
        BigInteger num2 = new BigInteger(str2.toString());
        BigInteger sum = num1.add(num2);

        
        String sumStr = sum.toString();
        ListNode Head = new ListNode(sumStr.charAt(0) - '0');
        ListNode current = Head;

        for (int i = 1; i < sumStr.length(); i++) {
            current.next = new ListNode(sumStr.charAt(i) - '0');
            current = current.next;
        }

        return reverse(Head);
    }

    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}