package Exericicios_java.arrayList;

/* Crie um ArrayList de Double já preenchido com alguns valores (pode ser 4 ou 5 valores).
Depois:

Mostre o primeiro elemento
Mostre o último elemento
Mostre o elemento do índice 2*/

import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();

        numeros.add(2.5);
        numeros.add(3.11);
        numeros.add(10.2);
        numeros.add(2777.5);
        numeros.add(123.5);

        System.out.println(numeros.getFirst());
        System.out.println(numeros.getLast());
        System.out.println(numeros.get(2));

    }
}
