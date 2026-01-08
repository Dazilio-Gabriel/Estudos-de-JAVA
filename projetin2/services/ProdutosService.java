package projetin2.services;

import projetin2.entidades.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutosService {

    List<Produtos> listaDosProdutos = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    Integer contadorId = 0;

    public void cadastroProdutos(Produtos produtos) {

        produtos.setIdProduto(contadorId);
        contadorId++;

        System.out.println("Cadastro de Produtos");
        System.out.println("Nome: " + produtos.getNome());
        System.out.println("descricao: " + produtos.getDescricao());
        System.out.println("Quantidade: " + produtos.getQuantidade());
        System.out.println("preco: " + produtos.getPreco());

        listaDosProdutos.add(produtos);

    }

    public void deletarProdutos(Produtos produtos) {

        System.out.println("Removendo um produto:");
        System.out.println("Digite o ID do produto: ");
        int idProduto = input.nextInt();

        listaDosProdutos.removeIf(p -> p.getIdProduto() == idProduto);

    }

    public void editarProdutos(Produtos produtos) {

        System.out.println("Editando produto:");
        System.out.println("Digite o ID do produto: ");
        int idProduto = input.nextInt();

    }

    public List<Produtos> listarProdutos() {
        for (Produtos p : listaDosProdutos) {
            System.out.println(p);
        }


        return new ArrayList<>();

    }

    public List<Produtos> buscarProdutos() {

        return new ArrayList<>();

    }

    public List<Produtos> filtrarProdutosOrdemAlfabetica() {

        return new ArrayList<>();
    }

    public List<Produtos> FiltrarProdutosQuantidade() {

        return new ArrayList<>();
    }

}
