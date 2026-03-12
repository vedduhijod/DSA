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
12    public ListNode oddEvenList(ListNode head) {
13if(head == null || head.next == null)
14    return head;
15
16        ListNode odd = head;
17        ListNode even = head.next;
18        ListNode evenHead = head.next;
19
20        while(even != null && even.next != null){
21            odd.next = odd.next.next;
22            even.next = even.next.next;
23
24            odd = odd.next;
25            even = even.next;
26        }
27        odd.next = evenHead;
28            return head;
29    }
30}