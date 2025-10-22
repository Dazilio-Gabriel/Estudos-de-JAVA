package curso_alura;

import java.util.Arrays;
import java.util.Scanner;

public class testandoArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite quantos numeros irao entrar no seu array");
        int numero = scanner.nextInt();

        int[] vetor = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("digite o numero do vetor " + (i + 1) + " i");
            int numerosVetor = scanner.nextInt();
            vetor[i] = numerosVetor;

        }

        System.out.println(Arrays.toString(vetor));

        scanner.close();
    }
}