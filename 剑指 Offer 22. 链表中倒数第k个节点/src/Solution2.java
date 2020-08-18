public class Solution2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

//    public ListNode getKthFromEnd(ListNode head, int k) {
//        ListNode p1, p2;
//        p1 = p2 = head;
//        int i = 1;
//        while(p2.next != null) {
//            if(i >= k) p1 = p1.next;
//            else i++;
//            p2 = p2.next;
//        }
//        return p1;
//    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1, p2;
        p1 = p2 = head;
        for(int i = 0; i < k; i++) {
            p2 = p2.next;
        }
        while(p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;

        }
        return p1;
    }
}
