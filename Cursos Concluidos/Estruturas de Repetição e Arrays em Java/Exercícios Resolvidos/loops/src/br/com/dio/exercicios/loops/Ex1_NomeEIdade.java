package br.com.dio.exercicios.loops;

/*
Faça um programa que leia conjutos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = in.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = in.nextInt();
        }
        System.out.println("Fim do programa!");
    }
}
