import java.util.LinkedList;

public class MinStack {

    private final LinkedList<Integer> main;
    private final LinkedList<Integer> min;

    public MinStack() {
        main = new LinkedList<>();
        min = new LinkedList<>();
    }

    public void push(int x) {
        main.push(x);
        if(min.isEmpty() || min.getFirst() >= x) min.push(x);
    }

    public void pop() {
        if(main.pop().equals(min.getFirst())) min.pop();
    }

    public int top() {
        return main.getFirst();
    }

    public int min() {
        return min.getFirst();
    }
}
