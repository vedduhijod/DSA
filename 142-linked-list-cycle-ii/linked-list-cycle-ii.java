/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * 
 */
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        Set<ListNode> log = new HashSet<>();

        ListNode current = head;

        while (current != null) {

            if (log.contains(current)) {
                return current;   // start of cycle
            }

            log.add(current);
            current = current.next;
        }

        return null;
    }
}