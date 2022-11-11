package main;

public class CuentaMain {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.establecerNombre("nombre");
        System.out.println("el nombre de la primer cuentas es: " + cuenta.obtenerNombre() );
        cuenta.establecerValor("12345");
        System.out.println("el valor de la cuenta es " + cuenta.obtenerValor());

        Cuenta cuenta2 = new Cuenta();
        cuenta2.establecerNombre("cuenta numero dos");
        cuenta2.establecerValor("1000000");
        System.out.println("cuenta2 tiene el nombre de " + cuenta2.obtenerNombre());
        System.out.println("el valor de la cuenta dos es " + cuenta2.obtenerValor());
        System.out.println("el resultado de sumar 20 + 30 es " + cuenta.sumar(20, 30));
    }
}
