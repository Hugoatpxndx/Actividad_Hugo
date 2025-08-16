public class DataTypeExamples {
    public static void ejemploListaSimple() {
        System.out.println("\nEjemplo de lista simple");

        LinkedList<String> listaCadena = new LinkedList<>(false, false);
        listaCadena.InsertarUltimaPosicion("A");
        listaCadena.InsertarUltimaPosicion("B");
        listaCadena.InsertarUltimaPosicion("C");
        System.out.println("Lista simple de cadena (izq a der):");
        listaCadena.MostrarOrdenNormal();
        System.out.println("Lista simple de cadena (der a izq):");
        listaCadena.MostrarAlReves();

        LinkedList<Integer> listaEnteros = new LinkedList<>(false, false);
        listaEnteros.InsertarUltimaPosicion(1);
        listaEnteros.InsertarUltimaPosicion(2);
        listaEnteros.InsertarUltimaPosicion(3);
        System.out.println("Lista simple de enteros (izq a der):");
        listaEnteros.MostrarOrdenNormal();
        System.out.println("Lista simple de enteros (der a izq):");
        listaEnteros.MostrarAlReves();

        LinkedList<Double> listaDobles = new LinkedList<>(false, false);
        listaDobles.InsertarUltimaPosicion(1.5);
        listaDobles.InsertarUltimaPosicion(2.5);
        listaDobles.InsertarUltimaPosicion(3.5);
        System.out.println("Lista simple de dobles (izq a der):");
        listaDobles.MostrarOrdenNormal();
        System.out.println("Lista simple de dobles (der a izq):");
        listaDobles.MostrarAlReves();
    }

    public static void ejemploListaDoble() {
        System.out.println("\nEjemplo de lista doble");

        LinkedList<String> listaCadena = new LinkedList<>(true, false);
        listaCadena.InsertarUltimaPosicion("A");
        listaCadena.InsertarUltimaPosicion("B");
        listaCadena.InsertarUltimaPosicion("C");
        System.out.println("Lista doble de cadena (izq a der):");
        listaCadena.MostrarOrdenNormal();
        System.out.println("Lista doble de cadena (der a izq):");
        listaCadena.MostrarAlReves();

        LinkedList<Integer> listaEnteros = new LinkedList<>(true, false);
        listaEnteros.InsertarUltimaPosicion(1);
        listaEnteros.InsertarUltimaPosicion(2);
        listaEnteros.InsertarUltimaPosicion(3);
        System.out.println("Lista doble de enteros (izq a der):");
        listaEnteros.MostrarOrdenNormal();
        System.out.println("Lista doble de enteros (der a izq):");
        listaEnteros.MostrarAlReves();

        LinkedList<Double> listaDobles = new LinkedList<>(true, false);
        listaDobles.InsertarUltimaPosicion(1.5);
        listaDobles.InsertarUltimaPosicion(2.5);
        listaDobles.InsertarUltimaPosicion(3.5);
        System.out.println("Lista doble de dobles (izq a der):");
        listaDobles.MostrarOrdenNormal();
        System.out.println("Lista doble de dobles (der a izq):");
        listaDobles.MostrarAlReves();
    }

    public static void ejemploListaCircularSimple() {
        System.out.println("\nEjemplo de lista circular simple");

        LinkedList<String> listaCadena = new LinkedList<>(false, true);
        listaCadena.InsertarUltimaPosicion("A");
        listaCadena.InsertarUltimaPosicion("B");
        listaCadena.InsertarUltimaPosicion("C");
        System.out.println("Lista circular simple de cadena (⟳):");
        listaCadena.MostrarOrdenNormal();
        System.out.println("Lista circular simple de cadena (⟲):");
        listaCadena.MostrarAlReves();

        LinkedList<Integer> listaEnteros = new LinkedList<>(false, true);
        listaEnteros.InsertarUltimaPosicion(1);
        listaEnteros.InsertarUltimaPosicion(2);
        listaEnteros.InsertarUltimaPosicion(3);
        System.out.println("Lista circular simple de enteros (⟳):");
        listaEnteros.MostrarOrdenNormal();
        System.out.println("Lista circular simple de enteros (⟲):");
        listaEnteros.MostrarAlReves();

        LinkedList<Double> listaDobles = new LinkedList<>(false, true);
        listaDobles.InsertarUltimaPosicion(1.1);
        listaDobles.InsertarUltimaPosicion(2.2);
        listaDobles.InsertarUltimaPosicion(3.3);
        System.out.println("Lista circular simple de dobles (⟳):");
        listaDobles.MostrarOrdenNormal();
        System.out.println("Lista circular simple de dobles (⟲):");
        listaDobles.MostrarAlReves();
    }

    public static void ejemploListaCircularDoble() {
        System.out.println("\nEjemplo de lista circular doble");

        LinkedList<String> listaCadena = new LinkedList<>(true, true);
        listaCadena.InsertarUltimaPosicion("A");
        listaCadena.InsertarUltimaPosicion("B");
        listaCadena.InsertarUltimaPosicion("C");
        System.out.println("Lista circular doble de cadena (⟳):");
        listaCadena.MostrarOrdenNormal();
        System.out.println("Lista circular doble de cadena (⟲):");
        listaCadena.MostrarAlReves();

        LinkedList<Integer> listaEnteros = new LinkedList<>(true, true);
        listaEnteros.InsertarUltimaPosicion(1);
        listaEnteros.InsertarUltimaPosicion(2);
        listaEnteros.InsertarUltimaPosicion(3);
        System.out.println("Lista circular doble de enteros (⟳):");
        listaEnteros.MostrarOrdenNormal();
        System.out.println("Lista circular doble de enteros (⟲):");
        listaEnteros.MostrarAlReves();

        LinkedList<Double> listaDobles = new LinkedList<>(true, true);
        listaDobles.InsertarUltimaPosicion(1.1);
        listaDobles.InsertarUltimaPosicion(2.2);
        listaDobles.InsertarUltimaPosicion(3.3);
        System.out.println("Lista circular doble de dobles (⟳):");
        listaDobles.MostrarOrdenNormal();
        System.out.println("Lista circular doble de dobles (⟲):");
        listaDobles.MostrarAlReves();
    }
}