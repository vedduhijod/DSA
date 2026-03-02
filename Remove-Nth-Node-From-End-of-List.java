1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        // Edge case: empty list
5        if (head == null) return null;
6
7        // Step 1: Count total nodes
8        int cnt = 0;
9        ListNode temp = head;
10
11        while (temp != null) {
12            cnt++;
13            temp = temp.next;
14        }
15
16        // Step 2: If deleting head
17        if (cnt == n) {
18            return head.next;
19        }
20
21        // Step 3: Find node before target
22        int res = cnt - n;
23        temp = head;
24
25        while (res > 1) {
26            temp = temp.next;
27            res--;
28        }
29
30        // Step 4: Delete node
31        temp.next = temp.next.next;
32
33        return head;
34    }
35}