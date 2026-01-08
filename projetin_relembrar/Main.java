package projetin_relembrar;

import projetin_relembrar.entidades.Pessoas;
import projetin_relembrar.services.PessoasServices;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PessoasServices servicos = new PessoasServices();

        while (true) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Inserir Pessoas");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Listar Pessoas Maiores de idade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            switch (input.nextLine()) {
                case "0":
                    System.out.println("Digite 0 para sair do programa ");
                    input.close();
                    return;

                case "1":
                    System.out.println("Voce ira cadastrar Pessoas: ");

                    Pessoas pessoas = new Pessoas();
                    servicos.inserirPessoas(pessoas);

                    break;

                case "2":
                    System.out.println("As pessoas cadastradas: ");
                    servicos.listarPessoas();

                    break;

                case "3":
                    System.out.println("As pessoas maiores de idade: ");

                    for (var p : servicos.maiorDeIdade()) {
                        System.out.println(p);
                    }

                    break;
            }
        }
    }
}
