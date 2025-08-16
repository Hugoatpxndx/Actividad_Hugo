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

    public void InsertarUltimaPosicion(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            if (isCircular) {
                head.setNext(head);
                if (isDoubly) head.setLast(head);
            }
            return;
        }
        tail.setNext(newNode);
        if (isDoubly) newNode.setLast(tail);
        tail = newNode;
        if (isCircular) {
            tail.setNext(head);
            if (isDoubly) head.setLast(tail);
        }
    }

    public void InsertarPrimeraPosicion(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            if (isCircular) {
                head.setNext(head);
                if (isDoubly) head.setLast(head);
            }
            return;
        }
        newNode.setNext(head);
        if (isDoubly) head.setLast(newNode);
        head = newNode;
        if (isCircular) {
            tail.setNext(head);
            if (isDoubly) head.setLast(tail);
        }
    }

    public Node<E> Buscar(String name) {
        if (head == null) return null;
        Node<E> current = head;
        do {
            if (current.getData() instanceof Contact contact &&
                    contact.nombre.equalsIgnoreCase(name)) {
                return current;
            }
            current = current.getNext();
        } while (isCircular ? current != head : current != null);
        return null;
    }

    public void Borrar(String name) {
        if (head == null) return;

        Node<E> current = head;
        Node<E> prev = null;

        do {
            boolean match = false;
            if (current.getData() instanceof Contact contact) {
                match = contact.nombre.equalsIgnoreCase(name);
            }

            if (match) {
                // Caso: lista con un solo nodo
                if (head == tail) {
                    head = tail = null;
                } else {
                    // Ajustar punteros de head y tail
                    if (current == head) head = current.getNext();
                    if (current == tail) tail = prev;

                    // Ajustar punteros de lista doble
                    if (isDoubly) {
                        if (current.getLast() != null) current.getLast().setNext(current.getNext());
                        if (current.getNext() != null) current.getNext().setLast(current.getLast());
                    } else {
                        // Lista simple
                        if (prev != null) prev.setNext(current.getNext());
                    }

                    // Ajustar punteros circulares
                    if (isCircular && tail != null) tail.setNext(head);
                    if (isDoubly && isCircular && head != null) head.setLast(tail);
                }
                return;
            }

            prev = current;
            current = current.getNext();
        } while (isCircular && current != head);

        // Para listas que no son las circulares
        while (!isCircular && current != null) {
            boolean match = false;
            if (current.getData() instanceof Contact contact) {
                match = contact.nombre.equalsIgnoreCase(name);
            }

            if (match) {
                if (current == head) head = current.getNext();
                if (current == tail) tail = prev;

                if (isDoubly) {
                    if (current.getLast() != null) current.getLast().setNext(current.getNext());
                    if (current.getNext() != null) current.getNext().setLast(current.getLast());
                } else {
                    if (prev != null) prev.setNext(current.getNext());
                }
                return;
            }

            prev = current;
            current = current.getNext();
        }
    }


    public void Actualizar(String name, Contact newData) {
        Node<E> node = Buscar(name);
        if (node != null) node.setData((E) newData);
    }

    public void MostrarOrdenNormal() {
        if (head == null) {
            System.out.println("Lista vacía.");
            return;
        }
        if (isCircular) {
            Node<E> current = head;
            StringBuilder line = new StringBuilder();
            do {
                line.append("-> ").append(current.getData()).append(" ");
                current = current.getNext();
            } while (current != head);
            // Para poder eliminar la última flecha
            String result = line.toString().trim();
            System.out.println(result);

            // Dibujar la línea con guiones para mostrar que es circular
            StringBuilder arrows = new StringBuilder();
            arrows.append("↑");
            for (int i = 1; i < result.length() - 2; i++) {
                arrows.append("-");
            }
            arrows.append("↓");
            System.out.println(arrows);

        } else {
            Node<E> current = head;
            do {
                System.out.print(current + " -> ");
                current = current.getNext();
            } while (current != null);
            System.out.println("null");
        }
    }

    public void MostrarAlReves() {
        if (!isDoubly) {
            // Lista simple o circular simple no tiene forma de irse de reversa
            System.out.println("Esta lista no tiene otro sentido.");
            return;
        }

        if (tail == null) {
            System.out.println("Lista vacía.");
            return;
        }
        Node<E> current = tail;
        if (isCircular && isDoubly) {
            StringBuilder line = new StringBuilder();
            do {
                line.append(current.getData()).append(" -> ");
                current = current.getLast();
            } while (current != tail);

            // Eliminar la última flecha
            if (line.length() >= 4) line.setLength(line.length() - 4);

            String result = line.toString();
            System.out.println(result);

            // Dibujar la línea con guiones
            StringBuilder arrows = new StringBuilder();
            arrows.append("↑");
            for (int i = 1; i < result.length() - 1; i++) arrows.append("-");
            arrows.append("↓");
            System.out.println(arrows);
            return;
        }

        // Lista doble no circular
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getLast();
        }
        System.out.println("null");
    }
}