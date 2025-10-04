package desafio_1Alura;

import java.util.Scanner;

public class Metodos {

    private String nome;
    private String tipoDaConta;
    private float salario;
    private Scanner scanner = new Scanner(System.in);

    public void DadosConta() {

        System.out.println("digite seu nome");
        nome = scanner.nextLine();
        System.out.println("qual o tipo da conta?");
        tipoDaConta = scanner.nextLine();
        System.out.println("digite seu saldo inicial");
        salario = scanner.nextFloat();

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoDaConta);
        System.out.println("Saldo inicial: R$ " + salario);
        System.out.println("***********************");

    }

    public void ReceberDinheiro() {

        System.out.println("\ndigite o valor que quer adicionar");
        float adicionar = scanner.nextInt();

        salario += adicionar;

        System.out.println("\nO saldo da sua conta atualizado é: "
                + salario);

    }

    public void TransferirDinheiro() {

        System.out.println("\ndigite o valor que voce quer transferir");
        float valorTransferencia = scanner.nextFloat();

        salario -= valorTransferencia;

    }

    public void ConsultarSalodo() {
        System.out.println("\nSaldo atual: " + salario);
    }

}