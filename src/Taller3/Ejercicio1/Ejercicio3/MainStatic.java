package Taller3.Ejercicio1.Ejercicio3;

public class MainStatic {
    public static void main(String[] args) {

        System.out.println("RESULTADOS EJERCICIO 3");

        System.out.println("--- Estado antes de la modificación ---");
        UsoStatic.mostrarDato();

        UsoStatic.modificarDatoCorrecto("Texto modificado correctamente gracias a static");

        System.out.println("\n--- Estado después de la modificación ---");
        UsoStatic.mostrarDato();
    }
}

class UsoStatic {


    private static String datoCorrecto = "Texto inicial";

    public static void modificarDatoCorrecto(String nuevoDato) {
        datoCorrecto = nuevoDato;
    }

    public static void mostrarDato() {
        System.out.println("Valor actual del dato: " + datoCorrecto);
    }
}