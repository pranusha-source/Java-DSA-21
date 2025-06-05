import java.util.ArrayList;
public class Stack<T> {
    private ArrayList<T> stack;
    public Stack() {
        stack = new ArrayList<>();
    }

    // Pushes an element onto the stack
    public void push(T value) {
        stack.add(value);
    }
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public void printStack() {
        System.out.println(stack);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: ");
        stack.printStack();

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop:");
        stack.printStack();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Size of stack: " + stack.size());
    }
}