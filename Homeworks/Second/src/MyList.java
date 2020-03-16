public class MyList <E>  {
    private Element head;

    public MyList(Element head) {
        this.head = head;
    }

    public MyList() {
        head = null;
    }

    public void insert(E data) {
        Element <E> elem = new Element <> (data , head);
        head = elem;
    }

    public void print() {
        if (head == null) {
            System.out.print("[]");
        } else {
            System.out.print("[" + head.getData());
            Element elem = head;
            while (elem.hasNext()) {
                elem = elem.getNext();
                System.out.print("," + elem.getData());
            }
            System.out.print("]");
        }
    }

    public void println() {
        print();
        System.out.print("\n");
    }

    public void removeHead() {
        head = head.getNext();
    }

    public Element getHead() {
        return head;
    }

    public void insertAfter(Element <E> cur, E data) {
        Element <E> element = new Element <> (data, cur.getNext());
        cur.setNext(element);
    }

    public void removeAfter(Element <E> cur) {
        if (cur.hasNext()) {
            if (cur.getNext().hasNext()) {
                cur.setNext(cur.getNext().getNext());
            } else {
                cur.setNext(null);
            }
        }
    }

    public int length() {
        if (head != null) {
            int l = 1;
            Element elem = head;
            while(elem.hasNext()) {
                elem = elem.getNext();
                l++;
            }
            return l;
        } else {
            return 0;
        }

    }

    public Element getPrevious(Element <E> elem) {
        if (elem != head) {
            Element cur = head;
            while (cur.getNext() != elem) {
                cur = cur.getNext();
            }
            return cur;
        } else {
            return null;
        }
    }

    //сделал так что только один из списков вводится в качестве параметра, думаю это не принципиально
    public MyList<E> intersect(MyList<E> ml) {
        MyList <E> nList = new MyList<>();
        Element<E> cur1 = head;
        Element<E> cur2 = ml.head;
        while (cur1 != null) {
            while (cur2 != null) {
                if (cur1.getData().equals(cur2.getData())) {
                    nList.insert(cur1.getData());
                }
                cur2 = cur2.getNext();
            }
            cur1 = cur1.getNext();
            cur2 = ml.head;
        }
        return nList;
    }

    /*    public void reverse() {
            if (length() > 1) {
                Element cur = head.getLast();
                cur.setNext(getPrevious(cur));
                Element cur2 = cur;
                cur = cur.getNext();
                while (cur != head) {
                    cur.setNext(getPrevious(cur));
                    cur = cur.getNext();
                }
                cur.setNext(null);
                head = cur2;
            }
        }
     */
}
