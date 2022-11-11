package main;

import java.util.Scanner;

public class EjercicioPag2 {

    public static void main(String[] args) {

        float numero1;
        float numero2;
        float suma;
        Scanner guarda = new Scanner(System.in);

        System.out.println("ingresa un numero");
        numero1 = guarda.nextFloat();
        System.out.println("ingresa otro numero");
        numero2 = guarda.nextFloat();
        suma = numero1+numero2;
        if (suma>20){
            System.out.println(" la suma es mayor a 20 con un valor de " + suma);
        }else{
            System.out.println(" la suma no es mayor3 a 20 con un valor de " + suma);
        }






    }
}
