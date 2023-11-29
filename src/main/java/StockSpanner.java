import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanner {
    private List<Integer> storage = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>();

    public StockSpanner() {

    }

    public int next(int price) {
        storage.add(price);
        while (!stack.isEmpty() && storage.get(stack.peek()) <= price){
            stack.pop();
        }
        int span = stack.isEmpty() ? storage.size() : storage.size() -  1 - stack.peek();
        stack.push(storage.size() - 1);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */