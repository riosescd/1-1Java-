package main;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExerciseOne {
     public static void main(String[] args) {
         Scanner guardar = new Scanner(System.in);
         ArrayList<String> helados = new ArrayList<>();

         System.out.println("buenas tardes bienenido a la tienda de helados");

         String desicion="si";
         while (desicion.equals("si")) {
             System.out.println("tenemos los siguientes sabores \n fresa \n chocolate \n frambuesa \n Cual desea llevar?");
             String helado = guardar.nextLine();
             helados.add(helado);


         if (!helado.equals("fresa") && (!helado.equals("cholate") && (!helado.equals("frambuesa")))){
             System.out.println("desea adicionar otro helado? \n si \n no");
             desicion = guardar.nextLine();
         }


         }

         for (String helado :helados){
             System.out.println("los helados que elegiste fueron:");
             System.out.println(helados);

         }

     }
}
