public class Contact {
    String nombre;
    String direccion;
    long telefono;  // <- cambio aquí
    double salario;

    public Contact(String nombre, String direccion, long telefono, double salario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "[Nombre: " + nombre + ", Dirección: " + direccion +
                ", Teléfono: " + telefono + ", Salario: $" + salario + "]";
    }
}