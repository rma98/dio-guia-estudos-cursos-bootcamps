package br.com.dio.exercicios.loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualque número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        System.out.println("Número: ");
        numero = in.nextInt();

        System.out.println("Tabuada de: " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}
