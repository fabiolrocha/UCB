package br.com.escola.pessoa;

//Classe aluna, onde temos qual curso ele está inscrito
public class Aluno extends Pessoa {
    public Aluno(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }

    public void inscreverCurso(String curso) {
        System.out.println(getNome() + " se inscreveu no curso de " + curso);
    }

    public void cancelarInscricao(String curso) {
        System.out.println(getNome() + " cancelou a inscrição no curso de " + curso);
    }
}
