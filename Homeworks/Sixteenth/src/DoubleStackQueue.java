import java.util.NoSuchElementException;
import java.util.Stack;

public class DoubleStackQueue<E> {
    Stack<E> stack1;
    Stack<E> stack2;

    public DoubleStackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public boolean isEmpty() {
        if (stack2.isEmpty() || stack1.isEmpty()) return true;
        else return false;
    }

    public boolean add(E e) {
        try {
            stack1.push(e);
            Stack cur = stack1;
            stack2 = new Stack<E>();
            while (!cur.isEmpty()) {
                stack2.push((E)cur.pop());
            }
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean offer(E e) {
        try {
            stack1.push(e);
            Stack cur = stack1;
            stack2 = new Stack<E>();
            while (!cur.isEmpty()) {
                stack2.push((E)cur.pop());
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public E remove() {
        try {
            E out = stack2.pop();
            Stack cur = stack2;
            stack1 = new Stack<E>();
            while (!cur.isEmpty()) {
                stack1.push((E)cur.pop());
            }
            return out;
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public E poll() {
        if (stack2.isEmpty()) {
            return null;
        } else {
            E out = stack2.pop();
            Stack cur = stack2;
            stack1 = new Stack<E>();
            while (!cur.isEmpty()) {
                stack1.push((E)cur.pop());
            }
            return out;
        }
    }

    public E element() {
        try {
            return stack2.peek();
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public E peek() {
        if (stack2.isEmpty()) {
            return null;
        } else {
            return stack2.peek();
        }
    }
}
