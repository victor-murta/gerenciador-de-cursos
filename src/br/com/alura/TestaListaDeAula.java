package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando arrays", 21);
        Aula a2 = new Aula("Listas de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);

        //Comparar duas aulas específicas
        //Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

    }
}
