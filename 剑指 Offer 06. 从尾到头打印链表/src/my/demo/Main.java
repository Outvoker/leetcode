package my.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

//    public static int[] reversePrint(ListNode head) {
//        ArrayList<Integer> a = new ArrayList();
//        ListNode p = head;
//        while(p != null) {
//            a.add(p.val);
//            p = p.next;
//        }
//        int[] res = new int[a.size()];
//        for(int i = 0; i < a.size(); i++) {
//            res[i] = a.get(a.size() - i - 1);
//        }
//        return res;
//    }

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(3);
        l.next.next = new ListNode(2);
        System.out.println(Arrays.toString(reversePrint(l)));
    }
}
