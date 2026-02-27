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
12    public ListNode reverseList(ListNode head) {
13        if(head == null || head.next == null) return head;
14        ListNode prev = null;
15        ListNode current = head;
16        ListNode next = head.next;
17
18        while(next != null){
19            current.next = prev;
20            prev = current;
21            current = next;
22            next = next.next;
23        }
24        current.next = prev;
25        return current;
26    }
27}