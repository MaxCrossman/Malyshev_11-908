public class Element {
    private Integer data;
    private Element next;
    private Element prev;

    public Element () {
        data = null;
        next = null;
        prev = null;
    }

    public Element (int data, Element prev, Element next) {
        this.data = data;
        setPrev(prev);
        setNext(next);
    }

    public int getData() {
        return data;
    }

    public Element getNext() {
        return next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setNext(Element next) {
        this.next = next;
        if (next != null) next.prev = this;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
        if (prev != null) prev.next = this;
    }

    public boolean hasNext() {
        if (next == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasPrev() {
        if (prev == null) {
            return false;
        } else {
            return true;
        }
    }
}