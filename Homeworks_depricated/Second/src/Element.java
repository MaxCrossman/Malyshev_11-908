public class Element <E> {
    private E data;
    private Element <E> next;

    public Element(E data, Element next) {
        this.data = data;
        this.next = next;
    }

    public Element() {
        data = null;
    }

    public void setNext(Element <E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public boolean hasNext() {
        if (next == null) {
            return false;
        } else {
            return true;
        }
    }

    public Element getNext() {
        return next;
    }

    public boolean equals(Element <E> element) {
        if (element.data.equals(this.data)) {
            return true;
        } else {
            return false;
        }
    }

    public Element getLast() {
        if (this!=null) {
            Element cur = this;
            while (cur.hasNext()) {
                cur = cur.getNext();
            }
            return cur;
        } else {
            return null;
        }
    }
}