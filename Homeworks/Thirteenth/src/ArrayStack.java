public class ArrayStack<E> {
    private E[] array;

    public ArrayStack() {
        array = null;

    }

    public boolean isEmpty() {
        if (array == null) {
            return true;
        } else return false;
    }

    public void push(E elem) {
        try {
            if (isEmpty()) {
                array = (E[]) new Object[1];
                array[0] = elem;
            } else {
                E[] cur = array;
                array = (E[]) new Object[array.length + 1];
                System.arraycopy(cur, 0, array, 0, cur.length);
                array[cur.length] = elem;
            }
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    public E peek() {
        if (isEmpty()) return null;
        else return array[array.length-1];
    }

    public E pop() {
        if (isEmpty()) return null;
        else {
            if (array.length == 1) {
                E out = array[0];
                array = null;
                return out;
            } else {
                try {
                    E[] cur = array;
                    E out = array[array.length - 1];
                    array = (E[]) new Object[array.length - 1];
                    System.arraycopy(cur, 0, array, 0, array.length);
                    return out;
                } catch (ClassCastException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }

    public String toString() {
        if (isEmpty()) return "[]";
        else {
            String result = "["+array[0];
            for (int i = 1; i < array.length; i++) {
                result += ","+array[i];
            }
            result += "]";
            return result;
        }
    }

    public void println() {
        System.out.println(toString());
    }
}
