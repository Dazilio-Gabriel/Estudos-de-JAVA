package projetin2.entidades;

public class Produtos {

    private Integer idProduto = 0;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private Double preco;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" + "idProduto=" + idProduto + ", nome='" + nome + '\'' + ", descricao='" + descricao + '\'' + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
}
