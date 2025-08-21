## Simulador de Sistema Operativo en Java
Este proyecto implementa un módulo básico de sistema operativo que gestiona comandos y procesos usando estructuras de datos dinámicos: pilas y colas, construidas sobre listas ligadas genéricas.

## Estructuras implementadas
Lista Ligada Genérica (LinkedList<E>)
Inserción al inicio y al final
Eliminación del primer nodo
Visualización de la lista
Manejo de nodos genéricos (Node<E>)

- Pila (Pila<E>)
- push(E dato): Agrega un comando al historial
- pop(): Deshace el último comando
- peek(): Consulta el último comando
- mostrar(): Muestra el historial completo

- Cola (Cola<E>)
- enqueue(E dato): Inicia un nuevo proceso
- dequeue(): Finaliza el proceso actual
- peek(): Consulta el proceso activo
- mostrar(): Muestra todos los procesos en ejecución

Cómo ejecutar el programa
Clona el repositorio o copia los archivos fuente en tu entorno local.
Ten Java instalado (versión 8 o más avanzada).
Compila todos los archivos .java:

   ```bash
   javac *.java