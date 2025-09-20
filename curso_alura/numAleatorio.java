package curso_alura;

import java.util.Random;
import java.util.Scanner;

public class numAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAleatorio = new Random().nextInt(100);

        int contador = 1;

        for (int i = 1; i <= 5; i++) {

            System.out.println("tente adivinhar o numero em 5 tentativas");
            int numero = scanner.nextInt();
            contador++;

            if (numAleatorio == numero) {
                System.out.println("o numero esta correto");
                break;

            } else if (numAleatorio > numero) {
                System.out.println("o numero digitado é maior");

            } else {
                System.out.println("o numero digitado é menor");

            }
            System.out.println(contador);
        }

        scanner.close();
    }

}
