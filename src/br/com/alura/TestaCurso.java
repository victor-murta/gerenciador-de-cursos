package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Victor");

        List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.adiciona(new Aula("Array", 22));

        System.out.println(javaColecoes);
    }


}
