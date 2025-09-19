package Exericicios_java.Loop;

import java.util.Scanner;

public class contagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero para vermos a contagem regressiva");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}