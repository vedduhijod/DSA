class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Edge case: empty list
        if (head == null) return null;

        // Step 1: Count total nodes
        int cnt = 0;
        ListNode temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // Step 2: If deleting head
        if (cnt == n) {
            return head.next;
        }

        // Step 3: Find node before target
        int res = cnt - n;
        temp = head;

        while (res > 1) {
            temp = temp.next;
            res--;
        }

        // Step 4: Delete node
        temp.next = temp.next.next;

        return head;
    }
}