package desafio_2Alura.entidades;

import java.util.Scanner;

public class Calculadora {
    public Scanner scanner = new Scanner(System.in);

    public void dobrar() {

        System.out.println("digite um numero inteiro");
        int numero = scanner.nextInt();

        int dobro = numero * 2;

        System.out.println("o numero dobrado é: " + dobro);

    }

}