package com.mycompany.ej4;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner jar = new Scanner(System.in);
        int año;

        while (true) {
            System.out.print("Introduce tu año de nacimiento/ (0) para salir: ");
            año = jar.nextInt();
            if (año == 0) break;
            int edad = 2025 - año;
            if (edad >= 18) {
                System.out.println("Eres apto para votar.");
            } else {
                System.out.println("No eres apto para votar.");
            }
        }
    }
}





