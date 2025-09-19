package Exericicios_java.Loop;

import java.util.Scanner;

public class somaDePares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        System.out.println("digite um numero par para saber a quantidade de pares");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                pares = pares + i;
            }
        }
        int quantidadePares = pares / 2;

        System.out.println("a soma de numeros pares é = " + pares + "\n"
                + "a quantidade de numeros pares é = " + quantidadePares);

        scanner.close();
    }
}