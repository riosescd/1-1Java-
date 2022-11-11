package main;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        float n1;
        float n2;
        float n3;
        Scanner guarda = new Scanner(System.in);

        System.out.println("ingresa un numero");
        n1 = guarda.nextFloat();
        System.out.println("ingresa otro numero");
        n2 = guarda.nextFloat();

        System.out.println("ingresa la opcion que deseas \n" +
                "                1=suma " + "\n"+
                "                2=multiplicar" + "\n" +
                "                3= restar" + "\n" +
                "                4= dividir  ");
        n3 = guarda.nextFloat();
        if(n3 == 1) {
            n3 = n1 + n2;
            System.out.println("la suma es de " + n3);
        }
        if(n3 == 2) {
            n3 = n1 * n2;
            System.out.println("la multiplicacion es de " + n3);
        }
        if(n3 == 3) {
            n3 = n1 - n2;
            System.out.println("la resta es de " + n3);
        }
        if(n3 == 4) {
            n3 = n1 / n2;
            System.out.println("la division es de " + n3);
        }
        }
    }
