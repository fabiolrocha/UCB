package br.com.imc.calculo;

public class Atleta extends Pessoa {
    
    public String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    public double calculoImcAtleta(){
        double imcAtleta = super.calculoImc();
        return imcAtleta * 0.95;
    }

}
