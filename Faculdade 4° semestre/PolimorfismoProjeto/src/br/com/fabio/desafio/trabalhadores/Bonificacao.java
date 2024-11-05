package br.com.fabio.desafio.trabalhadores;

public class Bonificacao {

    private int planoSaude;
    private int valeAlimentacao;
    private int diasExtras;

    public Bonificacao(int planoSaude, int valeAlimentacao, int diasExtras){
        super();
        this.planoSaude = planoSaude;
        this.valeAlimentacao = valeAlimentacao;
        this.diasExtras = diasExtras;
    }

    public int getPlanoSaude(){
        return planoSaude;
    }

    public void setPlanoSaude(){
        this.planoSaude = planoSaude;
    }

    public int getValeAlimentacao(){
        return valeAlimentacao;
    }

    public void setValeAlimentacao(){
        this.valeAlimentacao = valeAlimentacao;
    }

    public int getDiasExtras(){
        return planoSaude;
    }

    public void setDiasExtras(){
        this.diasExtras = diasExtras;
    }

    public double calculoDiasExtras(){
        return (diasExtras * 0.03);
    }

    public double bonusBasico(){
        return planoSaude + valeAlimentacao;
    }

    public double bonusIntermediario(){
        return planoSaude + valeAlimentacao;
    }

    public double bonusAvancado(){
        return planoSaude + valeAlimentacao;
    }

}
