public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> last;

    public Node(E data) {
        this.data = data;
        this.next = null;
        this.last = null;
    }

    public void setData(E data) { this.data = data; }
    public void setNext(Node<E> next) { this.next = next; }
    public void setLast(Node<E> last) { this.last = last; }

    public E getData() { return data; }
    public Node<E> getNext() { return next; }
    public Node<E> getLast() { return last; }

    @Override
    public String toString() {
        return data.toString();
    }
}
