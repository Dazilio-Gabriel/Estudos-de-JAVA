package desafio_2Alura.entidades;

public class Musica {

    public String titulo = "Nutshell";
    public String artista = "Alice in Chains";
    public int anoLancamento = 1994;
    public double avaliacao = 4.9;
    public int numAvaliacoes = 330;

    public void fichaTecnica() {

        System.out.println("***********************");
        System.out.println("Dados da musica:");
        System.out.println("nome da musica:" + titulo);
        System.out.println("artista: " + artista);
        System.out.println("ano de lancamento: " + anoLancamento);
        System.out.println("avaliacoes: " + avaliacao);
        System.out.println("numero de avaliacoes: " + numAvaliacoes);
        System.out.println("***********************\n");

    }
}