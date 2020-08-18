import java.util.ArrayList;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(head);
        while(head.next != null) {
            list.add(head.next);
            head = head.next;
        }
        return list.get(list.size() - k);
    }
}
