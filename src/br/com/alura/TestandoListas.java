package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args){
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a class aula ";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        aulas.remove(2);
        aulas.get(0);
        Collections.sort(aulas);

        aulas.forEach(a ->  System.out.println(a));


    }
}
