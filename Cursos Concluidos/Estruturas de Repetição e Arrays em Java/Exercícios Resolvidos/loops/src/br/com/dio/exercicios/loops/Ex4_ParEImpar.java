package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.print("N números lidos? ");
        n = in.nextInt();

        int count = 0;
        do {
            System.out.print("Número: ");
            numero = in.nextInt();
            count += 1;
            if (numero % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        } while (count < n);

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

    }
}
