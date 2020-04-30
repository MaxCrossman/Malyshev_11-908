public class Element<T> {
    T data;
    Element<T> next;

    public Element() {
        data = null;
        next = null;
    }

    public Element(T data, Element<T> next) {
        this.data = data;
        this.next = next;
    }

    public Element(Element<T> element) {
        data = element.data;
        next = element.next;
    }

    public boolean hasNext() {
        if (next == null) return false;
        else return true;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public Element<T> getNext() {
        return next;
    }
}
