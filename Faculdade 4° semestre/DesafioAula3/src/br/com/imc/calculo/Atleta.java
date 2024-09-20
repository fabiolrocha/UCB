package br.com.imc.calculo;

public class Atleta extends Pessoa {
    
    // Atributo
    public String esportePraticado;

    // Construtor
    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    // Calculo do IMC do atleta
    public double calculoImcAtleta(){
        double imcAtleta = super.calculoImc();
        return imcAtleta * 0.95;
    }

}
