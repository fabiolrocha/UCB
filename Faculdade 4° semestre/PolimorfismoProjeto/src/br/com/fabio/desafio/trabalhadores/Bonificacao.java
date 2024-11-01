package br.com.fabio.desafio.trabalhadores;

public class Bonificacao {

    private int planoSaude;
    private int valeAlimentacao;

    public Bonificacao(int planoSaude, int valeAlimentacao){
        super();
        this.planoSaude = planoSaude;
        this.valeAlimentacao = valeAlimentacao;
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

    public double bonusBasico(){
        planoSaude = 650;
        valeAlimentacao = 800;
        return planoSaude + valeAlimentacao;
    }

    public double bonusIntermediario(){
        planoSaude = 2500;
        valeAlimentacao = 1500;
        return planoSaude + valeAlimentacao;
    }

    public double bonusAvancado(){
        planoSaude = 5500;
        valeAlimentacao = 3500;
        return planoSaude + valeAlimentacao;
    }

}
