1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        // Edge case: empty list
5        if (head == null) return null;
6
7        ListNode fast = head;
8        ListNode slow = head;
9
10        // Move fast pointer n steps ahead
11        for (int i = 0; i < n; i++) {
12            fast = fast.next;
13        }
14
15        // If fast becomes null, we need to delete the head
16        if (fast == null) {
17            return head.next;
18        }
19
20        // Move both pointers together
21        while (fast.next != null) {
22            fast = fast.next;
23            slow = slow.next;
24        }
25
26        // Delete nth node from end
27        slow.next = slow.next.next;
28
29        return head;
30    }
31}