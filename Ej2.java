package com.mycompany.ej2;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner jar = new Scanner(System.in);
        double[][] notasAlumnos = new double[5][4]; 
        for (int s = 0; s < 5; s++) {
            System.out.println("Ingrese las notas del alumno " + (s + 1) + ":");
            double sumaNotas = 0;
            for (int r = 0; r < 3; r++) {
                System.out.print("Nota " + (r + 1) + ": ");
                notasAlumnos[s][r] = jar.nextDouble();
                sumaNotas += notasAlumnos[s][r];
            }
            notasAlumnos[s][3] = sumaNotas / 3;
        }
        System.out.println("\nNotas y promedios de los alumnos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notasAlumnos[i][j] + " ");
            }
            System.out.println("- Promedio: " + notasAlumnos[i][3]);
        }
    }
}



