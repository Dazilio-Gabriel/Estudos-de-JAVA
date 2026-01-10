package ex_alura_array.a;

import ex_alura_array.Individuo;

import java.util.ArrayList;
import java.util.List;

public class Services {

    public List<Individuo> galera() {
        List<Individuo> listaGalera = new ArrayList<>();

        Individuo i1 = new Individuo();
        Individuo i2 = new Individuo();
        Individuo i3 = new Individuo();

        i1.setNome("gabriel");
        i1.setIdade(20);
        listaGalera.add(i1);

        i2.setNome("giovana");
        i2.setIdade(21);
        listaGalera.add(i2);

        i3.setNome("alan");
        i3.setIdade(22);
        listaGalera.add(i3);

        return listaGalera;
    }
}