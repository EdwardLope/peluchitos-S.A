package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        String nombtre;
        String cedula;
        Integer opcion;
        Double costoTotal;
        Integer cantidadProducto;
        Double sumatoriaCostos =0.0;

        //PROCESO
        //CREAR UN MENU DE OCCIONES

        System.out.println("Bienbenido a peluchitos S.A");
        System.out.println("1.Cumpleaños");
        System.out.println("2.Dia de la mujer");
        System.out.println("3.Baby showers");
        System.out.println("4.Salir");


        //2.CONSTRUIR UN CICLO PARA PERMITIR QUE EL USUARIO ESCOJA
        do {
            System.out.print("Dijita la opcion deseada:");
            opcion=teclado.nextInt();

            //3.EVALUANDO LAS OPCIONES DEL MENU

            if (opcion==1){
                System.out.print("Digita cuantos kid de cumpleaños desea: ");
                cantidadProducto=teclado.nextInt();
                costoTotal=180000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;
            }else if (opcion==2){
                System.out.print("Digita cuantos kid del dia de la mujer desea: ");
                cantidadProducto=teclado.nextInt();
                costoTotal=60000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;
            }else if (opcion==3){
                System.out.print("Digita cuantos kid de Baby showers desea: ");
                cantidadProducto=teclado.nextInt();
                costoTotal=250000.0*cantidadProducto;
                sumatoriaCostos=sumatoriaCostos+costoTotal;
            }else if (opcion==4){
                System.out.print("Gracias por preferirnos asta pronto");
            }else {
                System.out.println("Occion no valida le invitamos a dijitar una opcion valida");
            }

        }while (opcion!=4);

        System.out.println("el costo total es de:"+sumatoriaCostos);




    }
}