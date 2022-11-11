package main;

public class Calculadora {
    private float n1,n2;


    public Calculadora(float n1, float n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void establecerN1 (float n1){this.n1 = n1;}
    public float obtenern1 (){
        return n1;
    }
    public void establecerN2 (float n2){this.n2 = n2;}
    public float obtenern2 (){
        return n2;
    }


    public float sumar (){
        return n1 + n2;
    }
    public float resta (){
        return n1 - n2;
    }
    public float multiplicar (){
        return n1 * n2;
    }
    public float dividir () {
        return n1 / n2;
    }

}
