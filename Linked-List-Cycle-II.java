1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * 
11 */
12 public class Solution {
13    public ListNode detectCycle(ListNode head) {
14
15        if (head == null || head.next == null) return null;
16
17        ListNode slow = head;
18        ListNode fast = head;
19
20        // Step 1: Detect cycle
21        while (fast != null && fast.next != null) {
22
23            slow = slow.next;
24            fast = fast.next.next;
25
26            if (slow == fast) {
27                break;
28            }
29        }
30
31        // No cycle
32        if (fast == null || fast.next == null) return null;
33
34        // Step 2: Find start of cycle
35        slow = head;
36
37        while (slow != fast) {
38            slow = slow.next;
39            fast = fast.next;
40        }
41
42        return slow;
43    }
44}