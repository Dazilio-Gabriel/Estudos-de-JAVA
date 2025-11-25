package Exericicios_java.arrayList;

import java.util.ArrayList;

/*Crie um ArrayList de Strings chamado nomes e:
Adicione 5 nomes.
Mostre todos os nomes na tela.  */

public class ex1 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("joao");
        nomes.add("carlos");
        nomes.add("adriano");
        nomes.add("Ana Elisa");
        nomes.add("Gabriel");

        for (String n : nomes) {
            System.out.println("[" + n + "]");
        }
    }
}
