package Ejercicio1;
public class Producto {
    // Atributos
    String nombre;
    double precio;

    // Constructor - recibe los mismos nombres que los atributos
    public Producto(String nombre, double precio) {
        // "this.nombre" = el atributo de la clase
        // "nombre" (sin this) = el parámetro que llegó
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodo para mostrar los datos
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 2500000);
        p1.mostrarProducto();
    }
}