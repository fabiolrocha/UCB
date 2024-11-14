package br.com.escola.pessoa;

public class Aluno extends Pessoa{

    private int numeroMatricula;
    private String curso;
    private String nivel;

    public Aluno(String nome, int cpf, String endereco, int idade, int numeroMatricula, String curso, String nivel) {
        super(nome, cpf, endereco, idade);
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
        this.nivel = nivel;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void inscreverCurso(){
        System.out.println("O aluno se inscreveu no curso: " + curso);
    }

    public void cancelarCurso(){
        System.out.println("O aluno cancelou o curso: " + curso);
    }
}
