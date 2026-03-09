1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * 
11 */
12 import java.util.HashSet;
13import java.util.Set;
14
15public class Solution {
16    public ListNode detectCycle(ListNode head) {
17
18        Set<ListNode> visited = new HashSet<>();
19
20        ListNode current = head;
21
22        while (current != null) {
23
24            if (visited.contains(current)) {
25                return current;   // cycle start node
26            }
27
28            visited.add(current);
29            current = current.next;
30        }
31
32        return null;
33    }
34}