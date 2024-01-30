package Juegos;

import java.util.Scanner;

public class Reloj {

    private int hora;
    private int minutos;
    private int segundos;
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
        } else {
            System.out.println("Hora, minutos o segundos inválidos.");
            // Por defecto, inicializamos la hora a las 00:00:00
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }
    public boolean modificarHora(int hora, int minutos, int segundos) {
        System.out.println("Introduce la hora: ");
        hora = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        minutos = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        segundos = sc.nextInt();
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
            return true;
        } else {
            System.out.println("Hora, minutos o segundos inválidos.");
            return false;
        }
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
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
