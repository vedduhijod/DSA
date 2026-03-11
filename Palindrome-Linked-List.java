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
12    public boolean isPalindrome(ListNode head) {
13
14        if(head == null || head.next == null)
15            return true;
16
17        // Step 1: Find middle
18        ListNode slow = head;
19        ListNode fast = head;
20
21        while(fast.next != null && fast.next.next != null){
22            slow = slow.next;
23            fast = fast.next.next;
24        }
25
26        // Step 2: Reverse second half
27        ListNode second = reverse(slow.next);
28        ListNode first = head;
29
30        // Step 3: Compare
31        while(second != null){
32            if(first.val != second.val)
33                return false;
34
35            first = first.next;
36            second = second.next;
37        }
38
39        return true;
40    }
41
42    private ListNode reverse(ListNode head){
43        ListNode prev = null;
44
45        while(head != null){
46            ListNode next = head.next;
47            head.next = prev;
48            prev = head;
49            head = next;
50        }
51
52        return prev;
53    }
54}