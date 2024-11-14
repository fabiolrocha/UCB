package br.com.escola.pessoa;

public class Professor extends Pessoa{

    private String especialidade;
    private String aulasAgendadas;
    private double salario;

    public Professor(String nome, int cpf, String endereco, int idade, String especialidade, String aulasAgendadas, double salario) {
        super(nome, cpf, endereco, idade);
        this.especialidade = especialidade;
        this.aulasAgendadas = aulasAgendadas;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getAulasAgendadas() {
        return aulasAgendadas;
    }

    public void setAulasAgendadas(String aulasAgendadas) {
        this.aulasAgendadas = aulasAgendadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void agendarAula(){
        System.out.println("A aula foi agendada para o dia: " + aulasAgendadas);
    }

    public void cancelarAula(){
        System.out.println("A aula foi cancelada: " + aulasAgendadas);
    }
}
