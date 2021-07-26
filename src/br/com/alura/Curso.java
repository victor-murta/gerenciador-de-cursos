package br.com.alura;

import java.util.*;

public class Curso {

    private int tempoTotal;
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    //private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    // <k, v> <key, value>
    // LinkedHashSet = estabelece a mesma ordem dos valores inseridos
    // TreeSet = ordena os elementos inseridos e pode ser definido , a comparação,  por meio de um Comparator

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }


    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        /*int tempoTotal = 0;
        for(Aula aula : aulas){
            tempoTotal += aula.getTempo();
        }*/

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }


    public Aluno buscaMatriculado(int numero) {
        if(!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException();
        return matriculaParaAluno.get(numero);
    }
}
