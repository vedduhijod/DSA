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
import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        // Step 1: Push all values to stack
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        // Step 2: Compare with stack
        temp = head;

        while(temp != null){
            if(temp.val != stack.pop()){
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}