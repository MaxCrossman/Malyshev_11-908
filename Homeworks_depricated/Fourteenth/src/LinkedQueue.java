import java.util.NoSuchElementException;

public class LinkedQueue<E> implements MyQueue {
    LinkedQueueElement<E> head;

    public LinkedQueue() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    @Override
    public boolean offer(Object o) {
        try {
        if (isEmpty()) {
            head = new LinkedQueueElement<E>((E)o,null);
        } else {
            LinkedQueueElement cur = head;
            while (cur.hasNext()) cur = cur.getNext();
            cur.setNext(new LinkedQueueElement<E>((E)o,null));
        }
        return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Object remove() {
        try {
            E out = head.getData();
            head = head.getNext();
            return out;
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
            System.exit(0);
            return null;
        }
    }

    @Override
    public Object poll() {
        if (isEmpty()) return null;
        else {
            E out = head.getData();
            head = head.getNext();
            return out;
        }
    }

    @Override
    public Object element() {
        try {
            return head.getData();
        } catch (NoSuchElementException ex) {
            ex.printStackTrace();
            System.exit(0);
            return null;
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) return null;
        else {
            return head.getData();
        }
    }
}
