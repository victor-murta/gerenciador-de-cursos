package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Victor");

        javaColecoes.adiciona(new Aula("Array", 22));
        javaColecoes.adiciona(new Aula("Criando aula", 25));

        Aluno a1 = new Aluno("Victor", 34435);
        Aluno a2 = new Aluno("André", 56232);

        javaColecoes.matricula(a1);

        System.out.println("Todos os alunos matriculados ");
        javaColecoes.getAlunos().forEach(a -> System.out.println(a));

        System.out.println("Aluno: " + javaColecoes.getAlunos() +" Matriculado?: " +(javaColecoes.estaMatriculado(a1)));

        Aluno v = new Aluno("Victor", 34435);

        System.out.println(a1.equals(v));
        System.out.println(a1.hashCode() == v.hashCode());

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();

        while( iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
