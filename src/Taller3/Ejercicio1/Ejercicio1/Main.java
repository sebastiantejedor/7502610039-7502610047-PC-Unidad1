package Taller3.Ejercicio1.Ejercicio1;

    public class Main {
        public static void main(String[] args) {

            System.out.println("========== RESULTADOS EJERCICIO 1 ==========");

            // Creando mis objetos tipo Coche
            Coche carro1 = new Coche("Chevrolet", "Spark GT");
            Coche carro2 = new Coche("Renault", "Logan");
            Coche carro3 = new Coche("Mazda", "3");
            Coche carro4 = new Coche("Toyota", "Corolla");

            // Llamo al método usando la clase directamente (demostración de static)
            Coche.mostrarCantidadCoches();
        }
    }
    class Coche {

        private String marca;
        private String modelo;

        private static int contadorCoches = 0;

        public Coche(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            contadorCoches++;
        }

        public static void mostrarCantidadCoches() {
            System.out.println("Total de carros registrados hasta ahora: " + contadorCoches);
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }
    }