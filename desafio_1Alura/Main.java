package desafio_1Alura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Metodos m = new Metodos();
        m.DadosConta();

        int opcao = -1;

        while (opcao != 4) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar Saldo 1");
            System.out.println("2 - Receber Valor 2");
            System.out.println("3 - Transferir Valor 3");
            System.out.println("4 - Sair do programa 4");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    m.ConsultarSalodo();
                    break;

                case 2:
                    m.ReceberDinheiro();
                    break;

                case 3:
                    m.TransferirDinheiro();
                    break;

                case 4:
                    System.out.println("\nVoce esta saindo do programa, obrigado pela preferencia");
                    break;

                default:
                    System.out.println("\nA opcao informada esta incorreto.");
                    break;
            }

        }

        scanner.close();
    }
}