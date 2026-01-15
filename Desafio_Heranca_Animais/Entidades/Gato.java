package Desafio_Heranca_Animais.Entidades;

public class Gato extends Animal {

    @Override
    public void dormir() {
        System.out.println("O gato esta dormindo");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato esta miando");
    }
}
