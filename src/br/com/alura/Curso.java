package br.com.alura;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String nome, String instrutor){
        nome = nome;
        instrutor = instrutor;
    }


    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + " Instrutor: " + this.instrutor;
    }
}
