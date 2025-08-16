import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            try {
                System.out.println("\nElije el tipo de lista:");
                System.out.println("1. Lista simple de contactos");
                System.out.println("2. Lista doble de contactos");
                System.out.println("3. Lista circular simple de contactos");
                System.out.println("4. Lista circular doble de contactos");
                System.out.println("5. Ejemplo lista simple");
                System.out.println("6. Ejemplo lista doble");
                System.out.println("7. Ejemplo lista circular simple");
                System.out.println("8. Ejemplo lista circular doble");
                System.out.println("0. Salir");
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingresa un número.");
                sc.nextLine(); // limpiar buffer
                continue;
            }

            LinkedList<Contact> listaContactos = null;

            switch (opcion) {
                case 1 -> listaContactos = new LinkedList<>(false, false);
                case 2 -> listaContactos = new LinkedList<>(true, false);
                case 3 -> listaContactos = new LinkedList<>(false, true);
                case 4 -> listaContactos = new LinkedList<>(true, true);
                case 5 -> DataTypeExamples.ejemploListaSimple();
                case 6 -> DataTypeExamples.ejemploListaDoble();
                case 7 -> DataTypeExamples.ejemploListaCircularSimple();
                case 8 -> DataTypeExamples.ejemploListaCircularDoble();
            }

            if (listaContactos != null) {
                int op2 = -1;
                do {
                    try {
                        System.out.println("\nOperaciones:");
                        System.out.println("1. Insertar al inicio");
                        System.out.println("2. Insertar al final");
                        System.out.println("3. Buscar");
                        System.out.println("4. Eliminar");
                        System.out.println("5. Actualizar");
                        System.out.println("6. Imprimir lista");
                        System.out.println("0. Volver al menú principal");
                        op2 = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Ingresa un número.");
                        sc.nextLine();
                        continue;
                    }

                    switch (op2) {
                        case 1, 2 -> {
                            try {
                                System.out.print("Nombre: "); String nombre = sc.nextLine();
                                System.out.print("Dirección: "); String direccion = sc.nextLine();
                                System.out.print("Teléfono: "); long telefono = Long.parseLong(sc.nextLine());
                                System.out.print("Salario: "); double salario = Double.parseDouble(sc.nextLine());
                                Contact c = new Contact(nombre, direccion, telefono, salario);
                                if (op2 == 1) listaContactos.InsertarUltimaPosicion(c);
                                else listaContactos.InsertarUltimaPosicion(c);
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Teléfono y salario deben ser numéricos.");
                            }
                        }
                        case 3 -> {
                            System.out.print("Nombre a buscar: ");
                            String nombre = sc.nextLine();
                            Node<Contact> n = listaContactos.Buscar(nombre);
                            System.out.println(n != null ? n.getData() : "No encontrado.");
                        }
                        case 4 -> {
                            System.out.print("Nombre a eliminar: ");
                            listaContactos.Borrar(sc.nextLine());
                        }
                        case 5 -> {
                            try {
                                System.out.print("Nombre a actualizar: ");
                                String nombre = sc.nextLine();
                                System.out.print("Nuevo Nombre: "); String nNombre = sc.nextLine();
                                System.out.print("Nueva Dirección: "); String direccion = sc.nextLine();
                                System.out.print("Nuevo Teléfono: "); long telefono = Long.parseLong(sc.nextLine());
                                System.out.print("Nuevo Salario: "); double salario = Double.parseDouble(sc.nextLine());

                                listaContactos.Actualizar(nombre, new Contact(nNombre, direccion, telefono, salario));
                            } catch (NumberFormatException e) {
                                System.out.println("Error: Teléfono y salario deben ser numéricos.");
                            }
                        }
                        case 6 -> {
                            listaContactos.MostrarOrdenNormal();
                            listaContactos.MostrarAlReves();
                        }
                    }
                } while (op2 != 0);
            }
        } while (opcion != 0);
    }
}