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
12    public ListNode swapPairs(ListNode head) {
13        if(head == null || head.next == null) return head;
14
15        ListNode restOfTheList = swapPairs(head.next.next);
16
17        ListNode secondOne = head.next;
18        secondOne.next = head;
19        head.next = restOfTheList;
20
21        return secondOne;
22    }
23}