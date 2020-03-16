public class Element {
    private String data;
    private Element next;

    public Element(String data, Element next) {
        this.data = data;
        this.next = next;
    }

    public Element() {
        data = null;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public String getData() {
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

    public boolean equals(Element element) {
        if (element.data == this.data) {
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