package Taller3.Ejercicio1.Ejercicio2;

public class MainMatematicas {
    public static void main(String[] args) {

        System.out.println("========== RESULTADOS EJERCICIO 2 ==========");

        System.out.println("Suma (25.5 + 4.5) = " + Matematicas.sumar(25.5, 4.5));
        System.out.println("Resta (10.0 - 3.2) = " + Matematicas.restar(10.0, 3.2));
        System.out.println("Multiplicación (7 * 8) = " + Matematicas.multiplicar(7, 8));
        System.out.println("División (40 / 5) = " + Matematicas.dividir(40, 5));

        System.out.println("División por cero (9 / 0) = " + Matematicas.dividir(9, 0));
    }
}

class Matematicas {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error matemático: No es posible dividir entre cero.");
            return 0;
        }
        return a / b;
    }
}