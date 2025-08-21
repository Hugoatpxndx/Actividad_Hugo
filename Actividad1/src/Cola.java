public class Cola<E> {
    private LinkedList<E> lista;

    public Cola() {
        lista = new LinkedList<>(false, false);
    }

    public void enqueue(E elemento) {
        lista.InsertarUltimaPosicion(elemento);
    }

    public E dequeue() {
        Node<E> primero = lista.BuscarInicio();
        if (primero == null) return null;
        E dato = primero.getData();
        lista.BorrarPorReferencia(primero);
        return dato;
    }

    public E peek() {
        Node<E> primero = lista.BuscarInicio();
        return primero != null ? primero.getData() : null;
    }

    public void mostrar() {
        lista.MostrarOrdenNormal();
    }
}