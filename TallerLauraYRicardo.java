/*Como contribución al sexto objetivo de desarrollo sostenible, agua limpia y saneamiento, se crea un algoritmo capaz 
de calcular el porcentaje semanal de personas que tuvieron acceso a agua limpia en un sector determinado
Para esto es importante tener en cuenta que en múltiples sectores el agua limpia es suministrada a las personas a través de puntos de encuentro en un horario determinado
Integrantes: Ricardo Rodríguez Loaiza - Laura Galvis Patiño
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Richardo Rod Loa
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el nombre del sector
        System.out.print("Ingrese el nombre del sector: ");
        String nombreSector = scanner.nextLine();

        // Pedir al usuario la cantidad total de personas en el sector
        System.out.print("Ingrese la cantidad total de personas en el sector: ");
        int totalPersonas = scanner.nextInt();

        // Pedir al usuario el número de días en los que hay acceso a agua limpia en una semana
        System.out.print("Ingrese el numero de dias en los que hay acceso a agua limpia en una semana: ");
        int diasAcceso = scanner.nextInt();

        // Inicializar el contador de personas con acceso a agua limpia
        int personasAcceso = 0;

        // Pedir al usuario los intervalos de horas en los que hay acceso a agua limpia
        System.out.print("Ingrese el inicio del intervalo de horas: ");
        int inicioIntervalo = scanner.nextInt();
        System.out.print("Ingrese el fin del intervalo de horas: ");
        int finIntervalo = scanner.nextInt();

        // Calcular la duración del intervalo en horas y más
        int duracionIntervalo = finIntervalo - inicioIntervalo;
        int totalHoras = duracionIntervalo * diasAcceso;

        // Sumar la cantidad de personas con acceso en este intervalo
        for (int i = 1; i <= diasAcceso; i++) {
            System.out.print("Ingrese la cantidad de personas con acceso en el intervalo " + i + ": ");
            int personasIntervalo = scanner.nextInt();
            personasAcceso += personasIntervalo;
        }

        // Calcular el porcentaje de personas con acceso a agua limpia en una semana
        double porcentajeAcceso = (double) personasAcceso / (totalPersonas) * 100;

        // Mostrar el resultado
        System.out.println("El porcentaje de personas con acceso a agua limpia en una semana es del " + porcentajeAcceso + "%");
        System.out.println("El total de horas con acceso a agua limpia en una semana en " + nombreSector + "es de " + totalHoras + "h");

        // Cerrar el escáner
        scanner.close();

        // TODO code application logic here
    }
    
}
