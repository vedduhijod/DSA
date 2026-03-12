/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;      
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }
        int ans = count/2;
        temp = head;
while(temp != null){
    ans--;

    if(ans == 0 && temp.next != null){
        temp.next = temp.next.next;
        break;
    }

    temp = temp.next;
}
        return head;
    }
}