package br.com.fabio.desafio.trabalhadores;

public class Estagiario extends Bonificacao{

    private int salario;

    public Estagiario(int planoSaude, int valeAlimentacao, int diasExtras, int salario) {
        super(planoSaude, valeAlimentacao, diasExtras);
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double salarioCompletoEstagiario(){
        return salario * calculoDiasExtras() + salario + bonusBasico();
    }
}
