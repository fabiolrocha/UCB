package br.com.imc.calculo;

public class Pessoa {

    // Atributos
    private String nome;
    private double peso;
    private double altura;

    //Construtor
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Calculo do IMC
    public double calculoImc(){
        return peso / (altura * altura);
    }
    
}
