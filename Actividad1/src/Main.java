import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<String> historialComandos = new Pila<>();
        Cola<String> procesosEnEjecucion = new Cola<>();

        int opcion = -1;
        do {
            try {
                System.out.println("\n------------------------------");
                System.out.println("  SIMULADOR DE SISTEMA BÁSICO");
                System.out.println("------------------------------");
                System.out.println("1. Ejecutar comando");
                System.out.println("2. Deshacer último comando");
                System.out.println("3. Operaciones de historial");
                System.out.println("4. Agregar proceso");
                System.out.println("5. Procesar comando");
                System.out.println("6. Ver procesos en ejecución");
                System.out.println("0. Salir del simulador");
                System.out.print("Opción elegida: ");
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingresa un número.");
                sc.nextLine();
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ejecutando comandos...");
                    System.out.print("Ingresa comando a ejecutar: ");
                    String comando = sc.nextLine();
                    historialComandos.push(comando);
                    System.out.println("Comando ejecutado: " + comando);
                }
                case 2 -> {
                    System.out.println("Realizando comandos...");
                    String deshecho = historialComandos.pop();
                    if (deshecho != null)
                        System.out.println("Comando deshecho: " + deshecho);
                    else
                        System.out.println("No hay comandos para deshacer.");
                }
                case 3 -> {
                    System.out.println("Operaciones de historial:");
                    historialComandos.mostrar();
                }
                case 4 -> {
                    System.out.println("Agregando procesos...");
                    System.out.print("Nombre del proceso: ");
                    String proceso = sc.nextLine();
                    procesosEnEjecucion.enqueue(proceso);
                    System.out.println("Proceso iniciado: " + proceso);
                }
                case 5 -> {
                    System.out.println("Procesando comandos...");
                    String terminado = procesosEnEjecucion.dequeue();
                    if (terminado != null)
                        System.out.println("Proceso finalizado: " + terminado);
                    else
                        System.out.println("No hay procesos en ejecución.");
                }
                case 6 -> {
                    System.out.println("Procesos en ejecución:");
                    procesosEnEjecucion.mostrar();
                }
                case 0 -> System.out.println("Saliendo del simulador...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
