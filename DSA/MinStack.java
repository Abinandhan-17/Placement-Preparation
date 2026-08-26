import java.util.Stack;

public class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        // If minStack is empty or val is smaller/equal
        // to current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {

        int removed = stack.pop();

        // Remove from minStack if it was the minimum
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {

        return stack.peek();
    }

    public int getMin() {

        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum: " + minStack.getMin());

        minStack.pop();

        System.out.println("Top: " + minStack.top());

        System.out.println("Minimum: " + minStack.getMin());
    }
}