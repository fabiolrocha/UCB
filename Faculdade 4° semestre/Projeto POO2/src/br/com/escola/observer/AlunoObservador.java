package br.com.escola.observer;


//Um dos usos do Observer, usando para mostrar qual curso ele está e avisar o outro observer
public class AlunoObservador implements Observador {
    private String nome;
    private String interesse; // Define o interesse do aluno (ex.: curso específico)

    public AlunoObservador(String nome, String interesse) {
        this.nome = nome;
        this.interesse = interesse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Aluno " + nome + " foi notificado: " + mensagem);
}

}
