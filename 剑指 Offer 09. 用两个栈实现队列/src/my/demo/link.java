package my.demo;

import java.util.LinkedList;

public class link {

    static class CQueue {

        private LinkedList<Integer> s1;
        private LinkedList<Integer> s2;

        public CQueue() {
            s1 = new LinkedList<>();
            s2 = new LinkedList<>();
        }

        public void appendTail(int value) {
            s1.addLast(value);
        }

        public int deleteHead() {
            if(!s2.isEmpty()) return s2.removeLast();
            if(s1.isEmpty()) return -1;
            while(!s1.isEmpty()) {
                s2.addLast(s1.removeLast());
            }
            return s2.removeLast();
        }
    }


    public static void main(String[] args) {
        CQueue obj = new CQueue();
        obj.appendTail(1);
        System.out.println(obj.deleteHead());
        obj.appendTail(2);
        obj.appendTail(3);
        obj.appendTail(4);
        obj.appendTail(5);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        obj.appendTail(6);
        obj.appendTail(7);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
}
