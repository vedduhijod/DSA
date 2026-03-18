1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */class Solution {
11    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
12        
13        ListNode dummy = new ListNode(0);
14        ListNode curr = dummy;
15        
16        int carry = 0;
17
18        while (l1 != null || l2 != null || carry != 0) {
19            
20            int sum = carry;
21
22            if (l1 != null) {
23                sum += l1.val;
24                l1 = l1.next;
25            }
26
27            if (l2 != null) {
28                sum += l2.val;
29                l2 = l2.next;
30            }
31
32            carry = sum / 10;
33
34            curr.next = new ListNode(sum % 10);
35            curr = curr.next;
36        }
37
38        return dummy.next;
39    }
40}