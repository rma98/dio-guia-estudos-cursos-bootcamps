package br.com.dio.exercicios.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor sejá inválido
e continue pedindo
até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota entre zero e dez: ");
        nota = in.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite novamente:");
            nota = in.nextInt();
        }
        System.out.println("Fim do programa!");
    }
}
