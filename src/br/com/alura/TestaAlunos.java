package br.com.alura;


import java.util.*;

public class TestaAlunos {
    public static void main(String[] args){
        // não é uma list(list é uma filha de collections; porque não é a mesma ordem , mas é filha de collections
        /*
        *não garante a ordem dos nomes inseridos (como uma sacola)
        * garante que não será adicionado elementos iguais*/

        //Set<String> alunos = new HashSet<>();
        Collection<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Rodrigo 1");
        alunos.add("Rodrigo 2");
        alunos.add("Rodrigo 3");
        alunos.add("Rodrigo 4");
        alunos.add("Rodrigo 4");
        //System.out.println(alunos);

        //for(String aluno : alunos){
        //    System.out.println(aluno);
        //}

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos.contains("Tem o victor"));
        System.out.println(alunos.size());
        System.out.println(alunos.remove("Rodrigo 4"));


        List<String> alunosEmLista = new ArrayList<>(alunos);


    }
}
