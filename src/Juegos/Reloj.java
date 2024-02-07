package Juegos;

import java.time.LocalTime;
import java.util.Scanner;

public class Reloj {

    private static int hora;
    private static int minutos;
    private static int segundos;
    private static String circuito;
    Scanner sc = new Scanner(System.in);

    public void setReloj(int hora, int minutos, int segundos) {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Reloj(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }
    public static void datosCircuito(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre del circuito: ");
        circuito = sc.nextLine();
    }
    public static String getCircuito() {
        return circuito;
    }
    public static int getMinutos() {
        return minutos;
    }

    public static void cuentaAtras() {
        int segundos = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos coches correrán la carrera?");
        int num = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[num];
        int[] velocidades = new int[num];
        int[] minutos = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el nombre del coche número " + (i + 1) + ":");
            nombres[i] = sc.nextLine();
            System.out.println("Introduce los minutos de vuelta del coche " + (i + 1) + ":");
            minutos[i] = sc.nextInt();
            sc.nextLine();
        }
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);
        System.out.println("Circuito: " + Reloj.getCircuito());
        System.out.println("Coches que correrán la carrera:");
        for (int i = 0; i < num; i++) {
            System.out.println("Correrá: " + nombres[i] + " con velocidad máxima de " + velocidades[i] + " km/h");
        }

        Reloj reloj =  new Reloj (24 , 60, 60);
        while (segundos > 0) {
            System.out.println(segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            segundos--;
        }
        System.out.println("¡Comienza la carrera!");
        int ganador = Coche.determinarGanador(minutos);
        System.out.println("El coche ganador es: " + nombres[ganador] + " con " + minutos[ganador] + " minutos.");
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}

