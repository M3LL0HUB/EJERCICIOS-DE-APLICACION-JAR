package com.mycompany.ej5;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner jar = new Scanner(System.in);
        double[] notas = new double[10];
        double mayorNota, sumaNotas = 0, menorNota;
        int aprobados = 0, menorPos = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = jar.nextDouble();
        }
        mayorNota = menorNota = notas[0];
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
            if (notas[i] > mayorNota) mayorNota = notas[i];
            if (notas[i] < menorNota) {
                menorNota = notas[i];
                menorPos = i;
            }
            if (notas[i] >= 3.0) aprobados++;
        }
        double promedio = sumaNotas / notas.length;
        double porcentajeAprobados = (aprobados / (double) notas.length) * 100;
        System.out.println("Mayor nota: " + mayorNota);
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Promedio de las notas: " + promedio);
        System.out.println("Posición de la menor nota: " + menorPos);
    }
}