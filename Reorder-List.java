1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14class Solution {
15    public void reorderList(ListNode head) {
16        if (head == null || head.next == null) {
17            return;
18        }
19
20        // Step 1: Find the end of the first half
21        ListNode slow = head;
22        ListNode fast = head.next;
23
24        while (fast != null && fast.next != null) {
25            slow = slow.next;
26            fast = fast.next.next;
27        }
28
29        // Step 2: Reverse the second half
30        ListNode second = reverse(slow.next);
31        slow.next = null;
32
33        // Step 3: Merge the two halves
34        ListNode first = head;
35
36        while (second != null) {
37            ListNode nextFirst = first.next;
38            ListNode nextSecond = second.next;
39
40            first.next = second;
41            second.next = nextFirst;
42
43            first = nextFirst;
44            second = nextSecond;
45        }
46    }
47
48    private ListNode reverse(ListNode head) {
49        ListNode prev = null;
50
51        while (head != null) {
52            ListNode next = head.next;
53            head.next = prev;
54            prev = head;
55            head = next;
56        }
57
58        return prev;
59    }
60}