package Exericicios_java.if_else;

import java.util.Scanner;

public class verificarSenhaEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "SenhaSuperSecreta123@";

        System.out.println("digite a senha pre-salva");
        String senhaDoUsuario = scanner.nextLine();

        if (senha.equals(senhaDoUsuario)) {
            System.out.println("voce digitou a senha corretamente\n"
                    + "Voce merece um chocolate");
        } else {
            System.out.println("voce digitou a senha errada, b u r r o");
        }

        scanner.close();
    }
}