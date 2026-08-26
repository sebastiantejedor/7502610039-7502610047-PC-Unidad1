package Taller2.Ejercicio2;
public class Estudiante {
    String nombre;
    int edad;

    // Constructor con 2 parámetros (el "completo")
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor por defecto - llama al de arriba usando this()
    public Estudiante() {
        this("Sin nombre", 0); // <- esto llama al constructor de 2 parámetros
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(); // usa el constructor vacío
        e1.mostrarDatos(); // imprime "Sin nombre" y 0

        Estudiante e2 = new Estudiante("Sebas", 20);
        e2.mostrarDatos(); // imprime "Sebas" y 20
    }
}