import java.util.*;

public class ArrayQueue<E> implements MyQueue {
    private E[] array;

    public ArrayQueue() {
        array = (E[]) new Object[0];
    }

    public boolean isEmpty() {
        if (array == null) return true;
        else return false;
    }

    @Override
    public boolean offer(Object o) {
        try {
            E[] cur = array;
            array = (E[]) new Object[array.length+1];
            System.arraycopy(cur,0,array,0,cur.length);
            array[array.length-1] = (E)o;
            return true;
        } catch (ClassCastException ex) {
            return false;
        }
    }

    @Override
    public Object remove() {
        try {
            E out = array[0];
            E[] cur = array;
            array = (E[]) new Object[array.length-1];
            System.arraycopy(cur,1,array,0,array.length);
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
            E out = array[0];
            E[] cur = array;
            array = (E[]) new Object[array.length-1];
            System.arraycopy(cur,1,array,0,array.length);
            return out;
        }
    }

    @Override
    public Object element() {
        try {
            return array[0];
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
            return array[0];
        }
    }
}
