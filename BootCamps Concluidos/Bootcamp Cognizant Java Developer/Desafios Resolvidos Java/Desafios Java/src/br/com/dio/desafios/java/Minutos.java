package br.com.dio.desafios.java;

import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int a;
        int b;

        System.out.println("Minutos: ");
        n = in.nextInt();
        System.out.println("Minutos necessários: ");
        a = in.nextInt();
        System.out.println("Minutos necessários: ");
        b = in.nextInt();

        if ((a + b) > n) System.out.println("Deixa para amanhã!");
        else System.out.println("Farei hoje!");
    }
}
