package com.mycompany.ej3;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner jar = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = jar.nextInt();
        }
        for (int num : numeros) {
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}

