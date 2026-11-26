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
    public ListNode reverseListNode(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       if(head==null || head.next==null) return true;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseListNode(slow);
        ListNode firstHalf = head;
        ListNode secondhalf = newHead;
        while(secondhalf!=null){
            if(firstHalf.val != secondhalf.val){
                reverseListNode(newHead);
                return false;
            }
            firstHalf = firstHalf.next;
            secondhalf = secondhalf.next;
        }
        reverseListNode(newHead);
        return true;
    }
}