/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.karenmaje2020;

import java.util.Scanner;

/**
 *
 * @author SO-LAB1-PC24
 */
public class KarenMaje2020 {

    public static void main(String[] args) {

        int[] notas = new int[7];
        Scanner sc = new Scanner(System.in);
        int nota;
        int i = 0;

        do {
            System.out.print("Ingrese la nota, recuerde que debe ser positiva: ");
            nota = sc.nextInt();
            if (nota > 0) {
                notas[i] = nota;
                i++;
            } else {
                System.out.println("Error, por favor verifique que la nota esté en positivo.");
            }
        } while (i < 7);

        int opciones;
        int total = 0;
        int puntuacion = 0;
        int promedio=0;
        int j = 0;
        int a = 0;
        
            System.out.println("Escoja alguna de las siguientes opciones:");
            System.out.println("Opcion 1: Total de puntuacion de la semana");
            System.out.println("Opcion 2: Calcular el promedio de puntuaciones y mostrar los dias por encima y por debajo del promedio");
            System.out.println("Opcion 3:Dia con la puntuacion más alta y la más baja");
            System.out.println("Opcion 4: Calcular el total de puntuaciones acumuladas de los cuatro primeros días y los cuatro últimos días");
            System.out.println("Opcion 5: Salir del menú");
            opciones = sc.nextInt();

            switch (opciones) {
                case 1 -> {
                    total = 0;
                    for (int j = 0; j < 7; j++) {
                        total = notas[i];
                    }
                    System.out.println("Total de puntuaciones de la semana: " + total);
                }

                case 2 -> {
                    promedio = 0;
                    for (int a = 0; a < 7; a++) {
                        promedio = notas[a];
                    }
                    int promedio = total / 7;
                    System.out.println("Promedio de las puntuaciones: " + promedio);

                    System.out.println("Días con puntuaciones por encima del promedio:");
                    for (int a = 0; a < 7; a++) {
                        if (notas[i] > promedio) {
                            System.out.println("Día " + (a + 1) + ": " + notas[i]);
                        }
                    }
                }
            }
        }
    }

