package br.com.fabio.desafio.formas.impl;

public class Circulo {

    private int raio;
    private double area;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void calcularArea(){
        area = 2 * 3.14 * raio;
        System.out.println("A área do Circulo é aproximadamente: " + area);
    }
}
