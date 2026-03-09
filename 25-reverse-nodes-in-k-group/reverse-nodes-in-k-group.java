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
    public ListNode reverseKGroup(ListNode head, int k) {

        // Step 1: check if k nodes exist
        ListNode temp = head;
        int count = 0;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // If less than k nodes remain, return head
        if (count < k) return head;

        // Step 2: reverse first k nodes
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Step 3: recursively process remaining nodes
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        // Step 4: return new head
        return prev;
    }
}
