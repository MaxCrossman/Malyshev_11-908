public class List {
    private Element head;

    public List(Element head) {
        this.head = head;
    }

    public List() {
        head = null;
    }

    public void insert(int data) {
        Element elem = new Element (data , head);
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

    public Element getHead() {
        return head;
    }

    public void insertAfter(Element cur, int data) {
        Element element = new Element(data, cur.getNext());
        cur.setNext(element);
    }

    public void removeAfter(Element cur) {
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

    public Element getPrevious(Element elem) {
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

    public void addSort(int i) {
        if (head == null) {
            insert(i);
        } else {
            if (head.getData() <= i) {
                head = new Element(i, head);
            } else {
                Element cur = head;
                while (cur.hasNext()) {
                    if (cur.getNext().getData() <= i) {
                        insertAfter(cur, i);
                        return;
                    }
                    cur = cur.getNext();
                }
                insertAfter(cur,i);
            }
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




}
