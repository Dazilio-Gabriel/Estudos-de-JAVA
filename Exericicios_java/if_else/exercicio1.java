package Exericicios_java.if_else;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if(numero > 0){
            System.out.println("esse numero é positivo");
        } else if(numero < 0){
            System.out.println("esse numero é negativo");
        } else{ 
            System.out.println("esse numero é zero");
        }

        scanner.close();
    }

}