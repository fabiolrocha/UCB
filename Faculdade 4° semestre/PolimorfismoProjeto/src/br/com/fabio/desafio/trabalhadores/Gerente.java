package br.com.fabio.desafio.trabalhadores;

public class Gerente extends Bonificacao{

    private int salario;

    public Gerente(int planoSaude, int valeAlimentacao, int salario) {
        super(planoSaude, valeAlimentacao);
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double salarioCompletoGerente(){
        salario = 7500;
        return salario + bonusIntermediario();
    }
}
