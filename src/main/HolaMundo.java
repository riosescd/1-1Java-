package main;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        String nombreCompleto = "Juan David Rios Escudero";
        float numerous1 = 5;
        float numerous2 = 3;
        boolean condicion = numerous1>numerous2;
        System.out.println("su nombre es " + nombreCompleto);
        Scanner guardar = new Scanner(System.in);
        System.out.println("escribe el primer dato");
        String num1 = guardar.nextLine();
        System.out.println("el dato que ingresaste es " + num1);
        System.out.println("escribe el segundo dato");
        String num2 = guardar.nextLine();
        System.out.println(" el sgundo dato es " + num2);
    }
}
