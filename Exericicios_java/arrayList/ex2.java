package Exericicios_java.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/* Crie um ArrayList de Integer e peça ao usuário 5 números.
Depois, exiba todos eles.*/

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("digite o numero 5 numeros inteiros");
            int controle = scanner.nextInt();
            numeros.add(controle);
        }

        for (int n : numeros) {
            System.out.println("[" + n + "]");
        }

    }
}
