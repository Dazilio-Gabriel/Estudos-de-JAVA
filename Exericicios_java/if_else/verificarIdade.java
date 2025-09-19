package Exericicios_java.if_else;

import java.util.Scanner;

public class verificarIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 16) {      
            System.out.println("voce pode votar");
        } else {
            System.out.println("voce nao pode votar");
        }
        
        scanner.close();
    }

}
