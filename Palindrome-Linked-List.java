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
13        if(head == null || head.next == null)
14        return true;
15
16        ListNode slow = head;
17        ListNode fast = head;
18
19        while(fast != null && fast.next != null){
20            slow = slow.next;
21            fast = fast.next.next;
22        }
23        
24        ListNode second = reverse(slow);
25        ListNode first = head;
26
27        while(second != null){
28            if(first.val != second.val){
29                return false;
30            }
31            first = first.next;
32            second = second.next;
33        }
34        return true;
35    }
36    private ListNode reverse(ListNode head){
37        ListNode prev = null;
38
39        while(head != null){
40            ListNode next = head.next;
41            head.next = prev;
42            prev = head;
43            head = next;
44        }
45        return prev;
46    }
47}