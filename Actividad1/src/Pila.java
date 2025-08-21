public class Pila<E> {
    private LinkedList<E> lista;

    public Pila() {
        lista = new LinkedList<>(false, false);
    }

    public void push(E elemento) {
        lista.InsertarPrimeraPosicion(elemento);
    }

    public E pop() {
        Node<E> top = lista.BuscarTope();
        if (top == null) return null;
        E dato = top.getData();
        lista.BorrarPorReferencia(top);
        return dato;
    }

    public E peek() {
        Node<E> top = lista.BuscarTope();
        return top != null ? top.getData() : null;
    }

    public void mostrar() {
        lista.MostrarOrdenNormal();
    }
}