1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3        if (head == null || head.next == null) {
4            return null;
5        }
6
7        ListNode slow = head;
8        ListNode fast = head;
9
10        // Step 1: Detect cycle
11        while (fast != null && fast.next != null) {
12            slow = slow.next;
13            fast = fast.next.next;
14
15            if (slow == fast) {
16                // Step 2: Find cycle start
17                ListNode ptr = head;
18
19                while (ptr != slow) {
20                    ptr = ptr.next;
21                    slow = slow.next;
22                }
23
24                return ptr;
25            }
26        }
27
28        return null;
29    }
30}