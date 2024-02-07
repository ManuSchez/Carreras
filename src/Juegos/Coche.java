package Juegos;

import java.util.Scanner;

public class Coche {
    private static String nombre;
    private static Reloj tiempoDeVuelta;
    public  Coche(String nombre, int horas, int minutos, int segundos1) {
        this.nombre = nombre;
        this.tiempoDeVuelta = new Reloj(horas, minutos, segundos1);
    }

    public static int determinarGanador(int[] minutos) {
        int indiceGanador = 0;
        for (int i = 1; i < minutos.length; i++) {
            if (minutos[i] < minutos[indiceGanador]) {
                indiceGanador = i;
            }
        }
        return indiceGanador;
    }
    public String toString() {
        return "Coche: " + nombre + ", Tiempo de vuelta: " + tiempoDeVuelta.toString();
    }
}