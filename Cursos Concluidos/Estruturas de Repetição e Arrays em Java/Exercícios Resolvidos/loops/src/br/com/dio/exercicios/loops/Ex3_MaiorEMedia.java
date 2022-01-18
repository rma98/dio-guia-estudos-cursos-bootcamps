package br.com.dio.exercicios.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float numero;
        float maior = 0;
        float soma = 0;

        int count = 0;
        do {
            System.out.print("Número: ");
            numero = in.nextFloat();

            if (numero > maior) maior = numero;

            count += 1;
            soma += numero;
        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
