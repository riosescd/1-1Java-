package main;

import java.util.Scanner;

public class TablasMultplicar {
    public static void main(String[] args){
        int n1=0,n2,n3,n4, n5, n6;
        Scanner guarda = new Scanner(System.in);
        System.out.println("ingrese el numero de la tabla que deseas");
        n2 = guarda.nextInt();

    while (n1<=12){
        n3= n2 * n1;
        System.out.println(+ n2 + "x" + n1 + "="+ n3);
        n1 = n1 + 1;
    }
        System.out.println("ingresa el numerode la tabla que deseas");
        n4 = guarda.nextInt();
    for ( n5 = 0; n5 <= 11 ; n5++ ){
        n6= n4 * n5;
        System.out.println(+ n4+ "x" + n5 + "=" + n6);

    }
    }
}
