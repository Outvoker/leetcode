public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        if(head.val == val) return head.next;
        while(p.next != null) {
            if(p.next.val == val) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] list = {4};
        int n = 1;
        //构造
        ListNode head = new ListNode(list[0]);
        ListNode p = head;
        for(int i = 1; i < list.length; i++) {
            p.next = new ListNode(list[i]);
            p = p.next;
        }
        //打印
        p = deleteNode(head, n);
        while(p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

}
