package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Victor");

        javaColecoes.adiciona(new Aula("Array", 22));
        javaColecoes.adiciona(new Aula("Criando aula", 25));

        Aluno a1 = new Aluno("Victor", 34435);
        Aluno a2 = new Aluno("André", 56232);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);

        Aluno aluno  = javaColecoes.buscaMatriculado(34435);
        System.out.println(aluno);

    }
}
