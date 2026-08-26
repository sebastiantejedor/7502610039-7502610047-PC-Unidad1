package Taller2.Ejercicio3;
public class Ejemplo {
    String mensaje = "Hola";

    // Opción A: quitar "static" para que sí pertenezca a un objeto
    public void metodoNoStatic() {
        System.out.println(this.mensaje); // ahora sí funciona
    }

    // Opción B: si debe seguir siendo static, usa un objeto explícito
    public static void metodoStatic(Ejemplo obj) {
        System.out.println(obj.mensaje); // usamos el objeto recibido, no "this"
    }

    public static void main(String[] args) {
        Ejemplo e = new Ejemplo();
        e.metodoNoStatic();
        metodoStatic(e);
    }
}