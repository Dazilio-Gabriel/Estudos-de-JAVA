package Exericicios_java.if_else;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota da C1");
        double nota1 = scanner.nextDouble();

        System.out.println("digite sua nota da C2");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("o aluno esta aprovado");
        } else if (media < 7 && media >= 5) {
            System.out.println("o aluno esta de recuperacao");
        } else {
            System.out.println("o aluno esta reprovado");
        }

        scanner.close();
    }

}
