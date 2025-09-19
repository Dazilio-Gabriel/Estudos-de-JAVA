package Exericicios_java.Loop;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero para voce ver a tabuada dele");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);

        }
        scanner.close();
    }

}