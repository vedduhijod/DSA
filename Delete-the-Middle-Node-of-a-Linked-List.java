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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head == null || head.next == null) return null;      
14        ListNode temp = head;
15        int count = 0;
16
17        while(temp != null){
18            temp = temp.next;
19            count++;
20        }
21        int ans = count/2;
22        temp = head;
23while(temp != null){
24    ans--;
25
26    if(ans == 0 && temp.next != null){
27        temp.next = temp.next.next;
28        break;
29    }
30
31    temp = temp.next;
32}
33        return head;
34    }
35}