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
    public static void datosVuelta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre del circuito: ");
        circuito = sc.nextLine();
        System.out.println("Introduce horas de tiempo de vuelta para clasificar: ");
        hora = sc.nextInt();
        System.out.println("Introduce minutos de vuelta para clasificar: ");
        minutos = sc.nextInt();
        System.out.println("Introduce segundos de vuelta para clasificar: ");
        segundos = sc.nextInt();
    }
    public void sumarSegundo() {
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
    }
    public static String getCircuito() {
        return circuito;
    }
    public static int getHora() {
        return hora;
    }

    public static int getMinutos() {
        return minutos;
    }

    public static int getSegundos() {
        return segundos;
    }
    public static void cuentaAtras() {
        int segundos = 6;
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

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
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}

