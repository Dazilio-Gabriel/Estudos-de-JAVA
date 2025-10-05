package desafio_2Alura.entidades;

import java.util.Scanner;

public class Carro {
    public Scanner scanner = new Scanner(System.in);

    public String modelo;
    public int ano;
    public String cor;

    public void dadosCarro() {

        System.out.println("digite o modelo do carro");
        modelo = scanner.nextLine();
        System.out.println("digite o ano do carro");
        ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("digite a cor do carro");
        cor = scanner.nextLine();

        System.out.println();

        System.out.println("***********************");
        System.out.println("Dados do carro:");
        System.out.println("o modelo do carro é: " + modelo);
        System.out.println("o ano do carro é: " + ano);
        System.out.println("a cor do carro é: " + cor);
        System.out.println("***********************\n");

    }

}