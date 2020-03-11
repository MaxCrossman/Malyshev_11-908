public class List <T> {
    private Element <T> head;

    public List(Element <T> head) {
        this.head = head;
    }

    public List() {
        head = null;
    }

    public void insert(T data) {
        Element <T> elem = new Element <> (data , head);
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
        System.out.println("");
    }

    public void removeHead() {
        head = head.getNext();
    }

    public Element <T> getHead() {
        return head;
    }

    public void insertAfter(Element <T> cur, T data) {
        Element element = new Element(data, cur.getNext());
        cur.setNext(element);
    }

    public void removeAfter(Element <T> cur) {
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

    public Element getPrevious(Element <T> elem) {
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

    public void reverse() {
        Element <T> helper1 = head;
        Element helper2 = head;
        Element <T> helper3 = new Element <> ();
        helper1.setNext(null);
        while (helper2.getNext() != null) {
            helper2 = helper2.getNext();
            helper3 = helper2;
            helper3.setNext(helper1);
            helper1 = helper3;
        }
        head = helper1;
    }

    public void deleteRepeats() {
        if (head != null && head.getNext() != null) {
            Element<T> cur = head;
            while (cur.getNext() != null) {
                if (cur.getData().equals(cur.getNext().getData())) {
                    cur.setNext(cur.getNext().getNext());
                } else {
                    cur = cur.getNext();
                }
            }
        }
    }



}
