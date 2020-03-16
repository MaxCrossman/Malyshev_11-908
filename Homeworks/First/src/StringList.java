public class StringList  {
    private Element head;

    public StringList(Element head) {
        this.head = head;
    }

    public StringList() {
        head = null;
    }

    public void insert(String data) {
        Element elem = new Element  (data , head);
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

    public void insertAfter(Element cur, String data) {
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
    /*
    задание 1 можно было реализовать используя списки из коллекций.
     */
    public void addStars() {
        Element cur = head;
        for (int i = 0; i < (length()+1)/2; i++) {
            insertAfter(cur, "*");
            cur = cur.getNext().getNext();
        }
    }

    public boolean hasStars() {
        Element cur = head;
        for (int i = 0; i < (length()+1)/2; i++) {
            if (!cur.getNext().getData().equals("*")) {
                return false;
            }
            cur = cur.getNext().getNext();
        }
        return true;
    }

    public void removeStars() {
        if (hasStars()) {
            Element cur = head;
            for (int i = 0; i < length(); i++) {
                cur.setNext(cur.getNext().getNext());
                cur = cur.getNext();
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
