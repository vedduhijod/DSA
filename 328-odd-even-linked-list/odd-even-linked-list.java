import java.util.*;

class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        // Store odd index values
        while(temp != null && temp.next != null){
            arr.add(temp.val);
            temp = temp.next.next;
        }

        if(temp != null)
            arr.add(temp.val);

        // Store even index values
        temp = head.next;

        while(temp != null && temp.next != null){
            arr.add(temp.val);
            temp = temp.next.next;
        }

        if(temp != null)
            arr.add(temp.val);

        // Rewrite values into linked list
        int i = 0;
        temp = head;

        while(temp != null){
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }
}