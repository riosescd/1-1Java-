package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        /*nombres.add("A");
        nombres.add("B");
        nombres.add("C");*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuario, cuantos nombre desea guardar");
        int numberOfNames = scanner.nextInt();

        for (int i = 1; i <= numberOfNames; i++){
            System.out.println("Usuario, digite el nombre numero " + i);
            System.out.println();
            String name = scanner.nextLine();
            nombres.add(name);

        }

       /*for (String nombre:nombres) {

            System.out.println(nombre);

        }*/

        nombres.forEach(System.out::println);



    }

}