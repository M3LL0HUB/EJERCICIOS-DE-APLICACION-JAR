package com.mycompany.ej1;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner jar = new Scanner(System.in);
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = jar.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            int cantidadRepeticiones = 0;
            boolean Contador = false;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    Contador = true;
                    break;
                }
            }
            if (!Contador) {
                for (int j = 0; j < 10; j++) {
                    if (numeros[i] == numeros[j]) {
                        cantidadRepeticiones++;
                    }
                }
                if (cantidadRepeticiones > 1) {
                    System.out.println("El número " + numeros[i] + " se repitió " + cantidadRepeticiones + " veces.");
                }
            }
        }
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += numeros[i];
        }
        double promedio = suma / 10;
        System.out.printf("El promedio de los 10 números ingresados es:" +promedio);
    }
}
