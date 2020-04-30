public class StackElement<T> {
    T data;
    StackElement<T> next;

    public StackElement(T data, StackElement<T> next) {
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

    public StackElement<T> getNext() {
        return next;
    }

    public void setNext(StackElement<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}
