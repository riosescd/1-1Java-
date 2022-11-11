package main;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args ){

        Scanner guarda = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        float n1 = guarda.nextFloat();

        System.out.println("ingresa el segundo numero");
        float n2 = guarda.nextFloat();

        Calculadora calculadora = new Calculadora(n1,n2);
        System.out.println("indica con el numero asignado lo que desees realizar \n"+
                "                1=sumar " + "\n"+
                "                2=multiplicar" + "\n" +
                "                3= restar" + "\n" +
                "                4= dividir  ");
        float n3 = guarda.nextFloat();

        if (n3==1){
            System.out.println("la suma de los dos numeros es de " + calculadora.sumar());
        }
        if (n3==2){
            System.out.println("la multiplicacion de los dos numeros es de " + calculadora.multiplicar());
        }
        if (n3==3){
            System.out.println("la resta de los dos numeros es de " + calculadora.resta());
        }
        if (n3==4){
            System.out.println("la division de los dos numeros es de " + calculadora.dividir());
        }



    }



}
