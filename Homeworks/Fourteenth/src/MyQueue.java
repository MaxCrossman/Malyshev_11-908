public interface MyQueue<E> {

    public boolean offer(E e);

    public E remove();

    public E poll();

    public E element();

    public E peek();

}
