package my.demo;

import java.nio.file.StandardWatchEventKinds;
import java.util.Stack;

public class Main {

    static class CQueue {

        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public CQueue() {
            s1 = new Stack();
            s2 = new Stack();
        }

        public void appendTail(int value) {
            s1.push(value);
        }

        public int deleteHead() {
            if(!s2.empty()) return s2.pop();
            if(s1.empty()) return -1;
            while(!s1.empty()) {
                s2.push(s1.pop());
            }
            return s2.pop();
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
