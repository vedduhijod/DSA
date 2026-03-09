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
11    public ListNode deleteDuplicates(ListNode head) {
12
13        if (head == null) return head;
14
15        ListNode curr = head;
16
17        while (curr.next != null) {
18
19            if (curr.val == curr.next.val) {
20                curr.next = curr.next.next;   // remove duplicate node
21            } 
22            else {
23                curr = curr.next;
24            }
25        }
26
27        return head;
28    }
29}