package desafio_2Alura;

import desafio_2Alura.entidades.Calculadora;
import desafio_2Alura.entidades.Carro;
import desafio_2Alura.entidades.Musica;
import desafio_2Alura.entidades.Pessoa;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.dobrar();

        Carro carro = new Carro();
        carro.dadosCarro();

        Musica musica = new Musica();
        musica.fichaTecnica();

        Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.HelloWord());
    }

}
