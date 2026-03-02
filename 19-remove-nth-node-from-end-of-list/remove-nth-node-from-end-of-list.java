class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Edge case: empty list
        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // If fast becomes null, we need to delete the head
        if (fast == null) {
            return head.next;
        }

        // Move both pointers together
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete nth node from end
        slow.next = slow.next.next;

        return head;
    }
}