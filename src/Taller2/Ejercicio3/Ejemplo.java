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

    static void main(String[] args) {
        Ejemplo e = new Ejemplo();
        e.metodoNoStatic();
        metodoStatic(e);
    }
}

/*
El código con error (a propósito):

java
public class Ejemplo {
    String mensaje = "Hola";

    public static void metodoStatic() {
        // ERROR: no se puede usar "this" aquí
        System.out.println(this.mensaje);
    }
}

error: non-static variable this cannot be referenced from a static context

¿Por qué pasa esto? this significa "el objeto actual". Pero un metodo static no pertenece a ningún objeto
pertenece a la clase en general. Se puede llamar sin crear ningún objeto (Ejemplo.metodoStatic()),
así que no existe ningún "this" al que referirse.
 */