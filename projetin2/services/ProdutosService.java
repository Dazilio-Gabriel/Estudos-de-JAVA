package projetin2.services;

import projetin2.entidades.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutosService {

    List<Produtos> listaDosProdutos = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

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

    public void deletarProdutos() {

        System.out.println("Removendo um produto:");
        System.out.println("Digite o ID do produto: ");
        int idProduto = input.nextInt();

        listaDosProdutos.removeIf(p -> p.getIdProduto() == idProduto);

    }

    public void editarProdutos() {

        System.out.println("Editando produto:");
        System.out.println("Digite o ID do produto: ");
        int idProduto = input.nextInt();

        for (Produtos p : listaDosProdutos) {
            if (p.getIdProduto() == idProduto) {


                System.out.println("digite o novo nome ");
                String nome = input.next();
                System.out.println("digite o novo descricao ");
                String descricao = input.next();
                System.out.println("Digite o novo quantidade ");
                int quantidade = input.nextInt();
                System.out.println("Digite o novo preco ");
                double preco = input.nextDouble();

                p.setNome(nome);
                p.setDescricao(descricao);
                p.setQuantidade(quantidade);
                p.setPreco(preco);

                return;

            }
        }
    }

    public void listarProdutos() {
        for (Produtos p : listaDosProdutos) {
            System.out.println(p);
        }
    }

    public List<Produtos> buscarProdutos() {

        System.out.println("Buscando Produtos ");
        System.out.println("Digite o ID do produto: ");
        int idProduto = input.nextInt();

        return listaDosProdutos.stream().filter(p -> p.getIdProduto() == idProduto).toList();

    }


    public List<Produtos> filtrarProdutosOrdemAlfabetica() {



        return filtrarProdutosOrdemAlfabetica();
    }

    public List<Produtos> FiltrarProdutosQuantidade() {

        System.out.println("Filtrando Produtos por quantidade");
        System.out.println("Digite o ID do produto: ");
        int quantidadeUsuario = input.nextInt();

        return listaDosProdutos.stream()
                .filter(p -> p.getQuantidade() >= quantidadeUsuario)
                .toList();

    }
}