package br.com.fabio.desafio.trabalhadores;

public class Estagiario extends Bonificacao{

    private int salario;

    public Estagiario(int planoSaude, int valeAlimentacao, int salario) {
        super(planoSaude, valeAlimentacao);
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double salarioCompletoEstagiario(){
        salario = 2500;
        return salario + bonusBasico();
    }
}
