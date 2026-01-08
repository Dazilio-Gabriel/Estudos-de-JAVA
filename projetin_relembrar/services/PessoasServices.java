package projetin_relembrar.services;

import projetin_relembrar.entidades.Pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoasServices {

    private final Scanner input = new Scanner(System.in);
    private final ArrayList<Pessoas> lista = new ArrayList<>();

    public void inserirPessoas(Pessoas pessoas) {

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        Integer idade = input.nextInt();

        pessoas.setNome(nome);
        pessoas.setIdade(idade);

        lista.add(pessoas);

    }

    public void listarPessoas() {

        for (Pessoas p : lista) {
            System.out.println(p);
        }
    }

    public List<Pessoas> maiorDeIdade() {
        List<Pessoas> maiores = new ArrayList<>();

        for (Pessoas p : this.lista) {
            if (p.getIdade() >= 18) {
                maiores.add(p);
            }
        }

        return maiores;
    }
}