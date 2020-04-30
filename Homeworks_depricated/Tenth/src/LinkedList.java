import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> extends LinkedCollection<E> implements List<E> {
    public Element<E> head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(Element<E> e) {
        head = e;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        while (collection.iterator().hasNext()) {
            add(i, collection.iterator().next());
        }
        return true;
    }

    @Override
    public E get(int i) {
        int i1 = 0;
        Element cur = head;
        while (i1 != i) {
            if (cur == null) {
                return null;
            }
            i1++;
            cur = cur.next;
        }
        return (E) cur.getData();
    }

    @Override
    public E set(int i, E e) {
        int i1 = 0;
        Element cur = head;
        while (i1 != i) {
            if (cur == null) {
                return null;
            }
            i1++;
            cur = cur.next;
        }
        E r = (E) cur.getData();
        cur.setData(e);
        return r;
    }

    @Override
    public void add(int i, E e) {
        if (isEmpty()) {
            if (i == 0) {
                head = new Element<>(e, null);
            }
        } else {
            int i1 = 0;
            Element cur = head;
            while (i1 != i-1) {
                if (cur == null) {
                    return;
                }
                i1++;
                cur = cur.next;
            }
            cur.setNext(new Element(e,cur.getNext()));
        }
    }

    @Override
    public E remove(int i) {
        int i1 = 0;
        Element cur = head;
        while (i1 != i) {
            if (cur == null) {
                return null;
            }
            i1++;
            cur = cur.next;
        }
        E r = (E) cur.getData();
        cur = cur.next;
        return r;
    }

    @Override
    public int indexOf(Object o) {
        int res = 0;
        Element cur = head;
        while (cur != null) {
            if (cur.getData().equals(o)) {
                return res;
            }
            res++;
            cur = cur.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int fin = -1;
        int res = 0;
        Element cur = head;
        while (cur != null) {
            if (cur.getData().equals(o)) {
                fin = res;
            }
            res++;
            cur = cur.next;
        }
        return fin;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new ListIterator<E>() {
            public Element elem = head;

            @Override
            public boolean hasNext() {
                if (elem.next == null)
                    return false;
                return true;
            }

            @Override
            public E next() {
                elem = elem.getNext();
                return (E) elem.getData();
            }

            @Override
            public boolean hasPrevious() {
                if (elem != head)
                    return false;
                return true;
            }

            @Override
            public E previous() {
                Element cur = head;
                while (cur.next != elem) {
                    cur = cur.next;
                }
                return (E) cur.getData();
            }

            @Override
            public int nextIndex() {
                int res = 0;
                Element cur = head;
                while (cur != elem) {
                    cur = cur.next;
                    res++;
                }
                return res + 1;
            }

            @Override
            public int previousIndex() {
                return nextIndex() - 2;
            }

            @Override
            public void remove() {
                remove();
            }

            @Override
            public void set(E data) {
                set(data);
            }

            @Override
            public void add(E data) {
                add(data);
            }
        };
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return (ListIterator<E>) new ListIterator<E>() {
            public Element elem = (Element) get(i);

            @Override
            public boolean hasNext() {
                if (elem.next == null)
                    return false;
                return true;
            }

            @Override
            public E next() {
                elem = elem.next;
                return (E) elem.getData();
            }

            @Override
            public boolean hasPrevious() {
                if (elem != head)
                    return false;
                return true;
            }

            @Override
            public E previous() {
                Element cur = head;
                while (cur.next != elem) {
                    cur = cur.next;
                }
                return (E) cur.getData();
            }

            @Override
            public int nextIndex() {
                int res = 0;
                Element cur = head;
                while (cur != elem) {
                    cur = cur.next;
                    res++;
                }
                return res + 1;
            }

            @Override
            public int previousIndex() {
                return nextIndex() - 2;
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
        List<E> elem = new LinkedList<>();
        for (int f = i; f < i1; f++) {
            elem.add(get(f));
        }
        return elem;
    }
}
