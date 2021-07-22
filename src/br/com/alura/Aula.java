package br.com.alura;

public class Aula implements Comparable<Aula> {
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo){
        titulo = titulo;
        tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    //usar para quando ele retornar o
    @Override
    public String toString(){
        return "Aula: " + this.titulo + " , " + " Duração: " + this.tempo;
    }


    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
