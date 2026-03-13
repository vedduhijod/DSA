1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode sortList(ListNode head) {
13
14        if (head == null || head.next == null)
15            return head;
16
17        // Find middle
18        ListNode slow = head;
19        ListNode fast = head;
20        ListNode prev = null;
21
22        while (fast != null && fast.next != null) {
23            prev = slow;
24            slow = slow.next;
25            fast = fast.next.next;
26        }
27
28        // Split list
29        prev.next = null;
30
31        // Sort both halves
32        ListNode left = sortList(head);
33        ListNode right = sortList(slow);
34
35        // Merge sorted lists
36        return merge(left, right);
37    }
38
39    private ListNode merge(ListNode l1, ListNode l2) {
40
41        ListNode dummy = new ListNode(0);
42        ListNode curr = dummy;
43
44        while (l1 != null && l2 != null) {
45
46            if (l1.val < l2.val) {
47                curr.next = l1;
48                l1 = l1.next;
49            } else {
50                curr.next = l2;
51                l2 = l2.next;
52            }
53
54            curr = curr.next;
55        }
56
57        if (l1 != null)
58            curr.next = l1;
59
60        if (l2 != null)
61            curr.next = l2;
62
63        return dummy.next;
64    }
65}