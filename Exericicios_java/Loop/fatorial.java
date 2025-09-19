package Exericicios_java.Loop;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicacao = 1;
        System.out.println("digite um numero inteiro positivo");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);

        scanner.close();
    }
}