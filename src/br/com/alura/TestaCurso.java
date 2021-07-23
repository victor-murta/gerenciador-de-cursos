package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Victor");

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        javaColecoes.adiciona(new Aula("Array", 22));
        javaColecoes.adiciona(new Aula("Criando aula", 25));

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);


        System.out.println(javaColecoes.getAulas());
        System.out.println(javaColecoes.getTempoTotal());

    }
}
