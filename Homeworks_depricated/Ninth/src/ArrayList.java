import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ArrayList<E> extends ArrayCollection<E> implements List<E> {

    private Object[] array = new Object[10];
    int size = 0;

    public Object[] getArray() {
        return array;
    }


    @Override
    public boolean addAll(int i1, Collection<? extends E> collection) {
        if (size + collection.size() > array.length) {
            Object[] t1 = new Object[size + collection.size()];
            for (int i = i1; i < size; i++) {
                t1[i] = array[i];
            }
            for (int i = size; i < collection.size(); i++) {
                t1[i] = collection.toArray()[i];
            }
            array = t1;
        } else {
            for (int i = size; i < collection.size(); i++) {
                array[i] = collection.toArray()[i];
            }
        }
        return true;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }




    @Override
    public E set(int i, E e1) {
        if (i < size()) {
            E p = (E) array[i];
            array[i] = e1;
            return p;
        } else
            throw new NoSuchElementException();
    }

    @Override
    public void add(int i1, E e1) {
        size++;
        if (size > array.length) {
            Object[] o = array;
            array = new Object[size];
            for (int i = 0; i < size; i++) {
                if (i == i1) {
                    array[i] = e1;
                }
                array[i] = o[i];
            }
        }
    }

    @Override
    public E remove(int i1) {
        E r = (E) array[i1];
        for (int i = i1; i < size - 1; i++) {
            array[i + 1] = array[i];
        }
        return r;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                res = i;
            }
        }
        return res;
    }


    @Override
    public ListIterator<E> listIterator() {
        int i = -1;
        return new ListIterator<E>() {
            @Override
            public boolean hasNext() {
                if (i + 1 <= size) {
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                return (E) array[i + 1];
            }

            @Override
            public boolean hasPrevious() {
                if (i - 1 >= -1) {
                    return true;
                }
                return false;
            }

            @Override
            public E previous() {
                return (E) array[i - 1];
            }

            @Override
            public int nextIndex() {
                return i + 1;
            }

            @Override
            public int previousIndex() {
                return i - 1;
            }

            @Override
            public void remove() {
                remove();
            }

            @Override
            public void set(E e) {
                set(e);
            }

            @Override
            public void add(E e) {
                add(e);
            }
        };
    }

    @Override
    public ListIterator<E> listIterator (int i) {
        return new ListIterator<E>() {
            @Override
            public boolean hasNext() {
                if (i + 1 <= size) {
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                return (E) array[i + 1];
            }

            @Override
            public boolean hasPrevious() {
                if (i - 1 >= -1) {
                    return true;
                }
                return false;
            }

            @Override
            public E previous() {
                return (E) array[i - 1];
            }

            @Override
            public int nextIndex() {
                return i + 1;
            }

            @Override
            public int previousIndex() {
                return i - 1;
            }

            @Override
            public void remove() {
                remove();
            }

            @Override
            public void set(E e) {
                set(e);
            }

            @Override
            public void add(E e) {
                add(e);
            }
        };
    }

    @Override
    public List<E> subList(int i, int i1) {
        List<E> e = new ArrayList();
        for (int p = i; p < i1; p++) {
            e.add((E) array[i]);
        }
        return e;
    }
}
