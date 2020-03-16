public class NumList {
    private Element head;

    public NumList(Element head) {
        this.head = head;
    }

    public NumList() {
        head = null;
    }

    public void insert(int data) {
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

    public Integer getMaxValue() {
        if (head != null) {
            Element cur = head;
            int max = head.getData();
            while (cur.hasNext()) {
                cur = cur.getNext();
                if (cur.getData() > max) {
                    max = cur.getData();
                }
            }
            return max;
        } else return null;
    }


    public Integer getCommonValue() {
        if (head != null) {
            int sum = head.getData();
            Element cur = head;
            while (cur.hasNext()) {
                cur = cur.getNext();
                sum += cur.getData();
            }
            return sum;
        } else return null;
    }

    public boolean hasNegative() {
        if (head != null) {
            if (head.getData() < 0) {
                return true;
            }
            Element cur = head;
            while (cur.hasNext()) {
                cur = cur.getNext();
                if (cur.getData() < 0) return true;
            }
            return false;
        } else return false;
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
