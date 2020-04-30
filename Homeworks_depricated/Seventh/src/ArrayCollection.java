import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection<T> implements Collection<T> {
    private T[] array;

    public ArrayCollection() {
        array = (T[]) new Object();
    }

    public ArrayCollection(T[] array) {
        this.array = array;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        if (array == null) {
            return true;
        } else return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return Arrays.asList(array).iterator();
    }

    @Override
    public T[] toArray() {
        return array;
    }

    Integer getIndexOf(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) return i;
        }
        return -1;
    }

    @Override
    public boolean add(T o) {
        try {
            T[] cur = array;
            array = (T[]) new Object[array.length + 1];
            System.arraycopy(cur, 0, array, 0, array.length-1);
            array[array.length] = o;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        try {
            T[] cur = array;
            array = (T[]) new Object[array.length-1];
            int index = getIndexOf((T)o);
            System.arraycopy(cur,0,array,0,index);
            System.arraycopy(cur,index+1, array,index,array.length-index-1);
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addAll(Collection collection) {
        try {
            T[] cur = array;
            array = (T[]) new Object[array.length + collection.size()];
            int index = cur.length;
            System.arraycopy(cur,0,array,0,index);
            System.arraycopy((T[])collection.toArray(),0,array,index,array.length - index);
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void clear() {
        array = null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        try {
            ArrayCollection<T> cur = new ArrayCollection<>();
            for (T e: this) {
                if (collection.contains(e)) cur.add(e);
            }
            array = cur.array;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        try {
            ArrayCollection<T> cur = new ArrayCollection<>();
            for (T e: this) {
                if (collection.contains(e)) cur.remove(e);
            }
            array = cur.array;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean containsAll(Collection collection) {
        if (collection.size() < size()) {
            for (T e : this) {
                if (collection.contains(e)) continue;
                else return false;
            }
            return true;
        } else return false;
    }

    @Override
    public T[] toArray(Object[] objects) {
        try {
            T[] cur = (T[]) new Object[array.length + objects.length];
            System.arraycopy(array,0,cur,0,array.length);
            System.arraycopy((T[])objects,array.length,cur,array.length,cur.length);
            return cur;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
            return array;
        }
    }
}
