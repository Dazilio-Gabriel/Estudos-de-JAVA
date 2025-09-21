package desafio_1Alura;

import java.util.Scanner;

public class Metodos {
    public void Conta() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("qual o tipo da conta?");
        String tipoDaConta = scanner.nextLine();
        System.out.println("digite seu saldo inicial");
        float salario = scanner.nextFloat();

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoDaConta);
        System.out.println("Saldo inicial: R$ " + salario);
        System.out.println("***********************");

        int opcao;

        do {
            System.out.println("1 = mudar seu nome");
            System.out.println("2 = alterar o tipo da conta");
            System.out.println("3 = editar o salario");
            System.out.println("escolha uma opcao: ");
            int opcoes = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("");
                    
                    break;
            
                default:
                    break;
            }
        }

        
     

        }
}