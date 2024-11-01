package br.com.fabio.desafio.trabalhadores;

public class Diretor extends Bonificacao {

    private int salario;

    public Diretor(int planoSaude, int valeAlimentacao, int salario) {
        super(planoSaude, valeAlimentacao);
        this.salario = salario;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(){
        this.salario = salario;
    }

    public double salarioCompletoDiretor(){
        salario = 15500;
        return salario + bonusAvancado();
    }


}
