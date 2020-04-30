public class Element<T> {
    T data;
    Element<T> next;

    public Element(T data, Element<T> next) {
        this.data = data;
        this.next = next;
    }

    public boolean hasNext() {
        if (next != null) return true;
        else return false;
    }

    public T getData() {
        return data;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}