package Desafio_Heranca_Animais;

import Desafio_Heranca_Animais.Entidades.Animal;
import Desafio_Heranca_Animais.Entidades.Cachorro;
import Desafio_Heranca_Animais.Entidades.Gato;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();

        Animal animais = new Animal();

        animais.bichos();

        System.out.println("--------------------------");

        dog.dormir();
        dog.emitirSom();

        Gato cat = new Gato();

        System.out.println("--------------------------");
        cat.dormir();
        cat.emitirSom();

    }
}
