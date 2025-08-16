public class Node<E> {
    public E data;
    private Node<E> head;
    private Node<E> tail;
    private Node<E> next;
    private Node<E> last;

    public Node(E data) {
        this.data = data;
        this.head = null;
        this.tail = null;
        this.next = null;
        this.last = null;
    }

    public void setData(E data) { this.data = data; }
    public void setHead(Node<E> head) { this.head = head; }
    public void setTail(Node<E> tail) { this.tail = tail; }
    public void setNext(Node<E> next) { this.next = next; }
    public void setLast(Node<E> last) { this.last = last; }

    public E getData() { return data; }
    public Node<E> getHead() { return head; }
    public Node<E> getTail() { return tail; }
    public Node<E> getNext() { return next; }
    public Node<E> getLast() { return last; }

    @Override
    public String toString() {
        return data.toString();
    }
}