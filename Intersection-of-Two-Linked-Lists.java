1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        if(headA == null || headB == null) return null;
15
16        ListNode temp1 = headA;
17        ListNode temp2 = headB;
18
19        while(temp1 != temp2){
20            temp1 = temp1.next;
21            temp2 = temp2.next;
22
23            if(temp1 == temp2) return temp1;
24            if(temp1 == null) temp1 = headB;
25            if(temp2 == null) temp2 = headA;
26
27        }
28        return temp1;
29    }
30}