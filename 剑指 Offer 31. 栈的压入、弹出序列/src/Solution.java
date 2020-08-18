import java.util.LinkedList;

public class Solution {
    LinkedList<Integer> stack = new LinkedList<>();

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        for(int num : pushed) {
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() == popped[i]) { // 循环判断与出栈
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

//    public boolean validateStackSequences(int[] pushed, int[] popped) {
//        int push = 0, pop = 0;
//        while(pop < popped.length){
//            if(stack.isEmpty()) {
//                stack.push(pushed[push]);
//                push++;
//            }
//            if(popped[pop] == stack.getFirst()) {
//                stack.pop();
//                pop++;
//            }
//            else {
//                if(push == pushed.length) return false;
//                stack.push(pushed[push]);
//                push++;
//            }
//        }
//        return true;
//    }
}
