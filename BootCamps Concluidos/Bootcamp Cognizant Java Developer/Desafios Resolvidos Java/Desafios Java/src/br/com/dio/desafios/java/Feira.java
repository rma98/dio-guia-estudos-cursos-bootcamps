package br.com.dio.desafios.java;

import java.util.Scanner;

public class Feira {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Pimentões Amarelos R$");
        a = in.nextInt();
        System.out.print("Pimentões Vermelhos R$");
        b = in.nextInt();

        int x = a + b;

        System.out.print("X Total de Pimentões: R$" + x);
    }
}
