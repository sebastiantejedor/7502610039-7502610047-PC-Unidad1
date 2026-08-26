package Taller3.Ejercicio1;

public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarCantidadCoches() {
        System.out.println("Cantidad de coches creados: " + contadorCoches);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}