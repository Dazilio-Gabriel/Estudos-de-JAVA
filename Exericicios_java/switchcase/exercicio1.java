package Exericicios_java.switchcase;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um dia da semana de 1 a 7 sendo 1 domingo");
        int dia = scanner.nextInt();

        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;

            case 2:
                nomeDia = "segunda";
                break;

            case 3:
                nomeDia = "terca";
                break;

            case 4:
                nomeDia = "quarta";
                break;

            case 5:
                nomeDia = "quinta";
                break;

            case 6:
                nomeDia = "sexta";
                break;

            case 7:
                nomeDia = "sabado";
                break;

            default:
                nomeDia = "numero invalido";
                break;
        }

        System.out.println("o dia da semana é: " + nomeDia);
        scanner.close();
    }

}
