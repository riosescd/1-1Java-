package main;

public class Cuenta {
    private String nombre;
    private String valor;

    public void establecerValor(String valor){this.valor = valor;}
    public String obtenerValor(){
        return valor;
    }
    public void establecerNombre(String nombre) {this.nombre = nombre;}

    public String obtenerNombre() {
        return nombre;
    }
    public float sumar(float n1, float n2 ){
        return n1+n2;



    }
}

