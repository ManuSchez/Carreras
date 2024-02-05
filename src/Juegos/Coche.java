package Juegos;

import java.util.Scanner;

public class Coche {
    private static String nombre;
    private static Reloj tiempoDeVuelta;
    public static void datosCoche(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos coches correrán la carrera?");
        int num = sc.nextInt();
        sc.nextLine();

        String[] nombre = new String[num];
        int[] velocidad = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el nombre del coche número " + (i + 1) + ":");
            nombre[i] = sc.nextLine();
            System.out.println("Introduce la velocidad máxima del coche número " + (i + 1) + ":");
            velocidad[i] = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente
        }
        System.out.println("Coches que correrán la carrera:");
        for (int i = 0; i < num; i++) {
            System.out.println("Correrá: " + nombre[i] + " con velocidad máxima de " + velocidad[i] + " km/h");
        }

    }
    public static void datosCircuito() {
        System.out.println("Circuito: " + Reloj.getCircuito());
        System.out.println("Horas de vuelta: "+ Reloj.getHora());
        System.out.println("Minutos de vuelta: "+ Reloj.getMinutos());
        System.out.println("Segundos de vuelta: " + Reloj.getSegundos());
    }

    public  Coche(String nombre, int horas, int minutos, int segundos1) {
        this.nombre = nombre;
        this.tiempoDeVuelta = new Reloj(horas, minutos, segundos1);
    }
        public String toString() {
            return "Coche: " + nombre + ", Tiempo de vuelta: " + tiempoDeVuelta.toString();
        }
    }




