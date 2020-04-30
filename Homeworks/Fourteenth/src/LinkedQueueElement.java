public class LinkedQueueElement<T> {
    T data;
    LinkedQueueElement<T> next;

    public LinkedQueueElement(T data, LinkedQueueElement<T> next) {
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

    public LinkedQueueElement<T> getNext() {
        return next;
    }

    public void setNext(LinkedQueueElement<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}
