import java.util.Collection;
import java.util.Iterator;

public class LinkedCollection<E> implements Collection<E> {
    Element<E> head;

    public LinkedCollection() {
        head = null;
    }

    public LinkedCollection(E[] mas) {
        for (E elem: mas) {
            add(elem);
        }
    }

    @Override
    public int size() {
        if (head == null) {
            return 0;
        } else {
            int c = 1;
            Element cur = head;
            while (cur.hasNext()) {
                c++;
                cur = cur.getNext();
            }
            return c;
        }
    }

    @Override
    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    @Override
    public boolean contains(Object o) {
        if (head != null) {
            try {
                if (head.getData().equals((E) o)) {
                    return true;
                } else {
                    Element cur = head;
                    while (cur.hasNext()) {
                        cur = cur.getNext();
                        if (cur.getData().equals((E) o)) return true;
                    }
                    return false;
                }
            } catch (ClassCastException ex) {
                ex.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        if (head != null) {
            Object[] mas = new Object[size()];
            mas[0] = head.getData();
            Element cur = head;
            int i = 0;
            while (cur.hasNext()) {
                cur = cur.getNext();
                i++;
                mas[i] = cur.getData();
            }
            return mas;
        } else return null;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        T[] mas1 = (T[]) this.toArray();
        T[] mas = (T[])new Object[mas1.length+ts.length];
        System.arraycopy(mas1,0,mas,0,mas1.length);
        System.arraycopy(ts,0,mas,mas1.length,ts.length);
        return mas;
    }

    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Element<>(e,null);
        } else {
            head = new Element<>(e, head);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            if (head.getData().equals(o)) {
                head = head.getNext();
                return true;
            } else {
                while (true) {

                }
            }
        } else return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }
}
