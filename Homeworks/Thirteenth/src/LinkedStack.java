public class LinkedStack<E> {
    StackElement<E> head;

    public LinkedStack() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    public void push(E data) {
        if (isEmpty()) head = new StackElement<E>(data,null);
        else head = new StackElement<E>(data, head);
    }

    public E peek() {
        return head.getData();
    }

    public E pop() {
        E out = head.getData();
        head = head.getNext();
        return out;
    }

    public String toString() {
        if (isEmpty()) return "[]";
        else {
            String result = head.getData()+"]";
            StackElement cur = head;
            while (cur.hasNext()) {
                cur = cur.getNext();
                result = cur.getData()+ "," + result;
            }
            result = "[" + result;
            return result;
        }
    }

    public void println() {
        System.out.println(toString());
    }
}
