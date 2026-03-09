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
12    public ListNode reverseKGroup(ListNode head, int k) {
13
14        // Step 1: check if k nodes exist
15        ListNode temp = head;
16        int count = 0;
17
18        while (temp != null && count < k) {
19            temp = temp.next;
20            count++;
21        }
22
23        // If less than k nodes remain, return head
24        if (count < k) return head;
25
26        // Step 2: reverse first k nodes
27        ListNode prev = null;
28        ListNode curr = head;
29        ListNode next = null;
30        count = 0;
31
32        while (curr != null && count < k) {
33            next = curr.next;
34            curr.next = prev;
35            prev = curr;
36            curr = next;
37            count++;
38        }
39
40        // Step 3: recursively process remaining nodes
41        if (next != null) {
42            head.next = reverseKGroup(next, k);
43        }
44
45        // Step 4: return new head
46        return prev;
47    }
48}
49