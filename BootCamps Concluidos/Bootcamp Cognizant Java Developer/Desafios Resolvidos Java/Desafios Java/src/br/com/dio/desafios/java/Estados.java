package br.com.dio.desafios.java;

import java.util.Scanner;

public class Estados {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;

        System.out.println("DDD: ");
        a = in.nextInt();

        if (a == 61) {
            System.out.println("Brasília\n");
        }
        else if (a == 71) {
            System.out.println("Salvador\n");
        }
        else if (a == 11) {
            System.out.println("São Paulo\n");
        }
        else if (a == 21) {
            System.out.println("Rio de Janeiro\n");
        }
        else if (a == 32) {
            System.out.println("Juiz de Fora\n");
        }
        else if (a == 19) {
            System.out.println("Campinas\n");
        }
        else if (a == 27) {
            System.out.println("Vitória\n");
        }
        else if (a == 31) {
            System.out.println("Belo Horizonte\n");
        }
        else if (a == 81) {
            System.out.println("Pernambuco\n");
        }
        else System.out.println("DDD não cadastrado\n");
    }
}
