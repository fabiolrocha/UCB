package br.com.fabio.desafio.trabalhadores;

public class Gerente extends Bonificacao{

    private int salario;

    public Gerente(int planoSaude, int valeAlimentacao, int diasExtras, int salario) {
        super(planoSaude, valeAlimentacao, diasExtras);
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double salarioCompletoGerente(){
        return salario * calculoDiasExtras() + salario + bonusIntermediario();
    }
}
