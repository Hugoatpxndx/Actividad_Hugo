public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private boolean isDoubly;
    private boolean isCircular;

    public LinkedList(boolean isDoubly, boolean isCircular) {
        this.head = null;
        this.tail = null;
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
    }

    public void InsertarPrimeraPosicion(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            if (isCircular) tail.setNext(head);
            if (isDoubly && isCircular) head.setLast(tail);
            return;
        }
        newNode.setNext(head);
        if (isDoubly) head.setLast(newNode);
        head = newNode;
        if (isCircular) tail.setNext(head);
        if (isDoubly && isCircular) head.setLast(tail);
    }

    public void InsertarUltimaPosicion(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            if (isCircular) tail.setNext(head);
            if (isDoubly && isCircular) head.setLast(tail);
            return;
        }
        tail.setNext(newNode);
        if (isDoubly) newNode.setLast(tail);
        tail = newNode;
        if (isCircular) tail.setNext(head);
        if (isDoubly && isCircular) head.setLast(tail);
    }

    public Node<E> BuscarInicio() {
        return head;
    }

    public Node<E> BuscarTope() {
        return head;
    }

    public void BorrarPorReferencia(Node<E> nodo) {
        if (nodo == null || head == null) return;

        if (nodo == head && nodo == tail) {
            head = tail = null;
            return;
        }

        if (nodo == head) {
            head = head.getNext();
            if (isDoubly && head != null) head.setLast(null);
            if (isCircular && tail != null) tail.setNext(head);
            return;
        }

        if (nodo == tail) {
            tail = tail.getLast();
            if (tail != null) tail.setNext(null);
            if (isCircular && tail != null) tail.setNext(head);
            return;
        }

        Node<E> prev = nodo.getLast();
        Node<E> next = nodo.getNext();

        if (prev != null) prev.setNext(next);
        if (next != null && isDoubly) next.setLast(prev);
    }

    public void MostrarOrdenNormal() {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Node<E> current = head;
        do {
            System.out.print(current + " → ");
            current = current.getNext();
        } while (isCircular ? current != head : current != null);

        if (!isCircular) System.out.println("null");
        else System.out.println("↩︎");
    }

    public void MostrarAlReves() {
        if (tail == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Node<E> current = tail;
        do {
            System.out.print(current + " ← ");
            current = current.getLast();
        } while (isCircular ? current != tail : current != null);

        if (!isCircular) System.out.println("null");
        else System.out.println("↩︎");
    }

}