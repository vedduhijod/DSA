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
        if (head == null || k == 1) return head;

        ListNode left = head;
        ListNode prevGroupTail = null;
        ListNode res = null;

        while (left != null) {

            // Find kth node
            ListNode right = left;
            for (int i = 1; i < k && right != null; i++) {
                right = right.next;
            }

            // Fewer than k nodes left
            if (right == null) {
                if (prevGroupTail != null)
                    prevGroupTail.next = left;
                if (res == null)
                    res = left;
                break;
            }

            ListNode nextGroup = right.next;

            // Reverse current group
            ListNode newHead = reverse(left, k);

            if (prevGroupTail != null)
                prevGroupTail.next = newHead;

            if (res == null)
                res = newHead;

            // Old head becomes tail after reversal
            prevGroupTail = left;
            left = nextGroup;
        }

        return res;
    }

    private ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;

        while (k-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Connect tail of reversed group to remaining list
        head.next = curr;

        return prev;
    }
}