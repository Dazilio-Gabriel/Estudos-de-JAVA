package Desafio_Heranca_Animais.Entidades;

public class Cachorro extends Animal {

    @Override
    public void dormir() {
        System.out.println("O cachorro esta dormindo");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro esta latindo");
    }
}
