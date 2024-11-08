package br.com.fabio.desafio.formas.impl;

import br.com.fabio.desafio.calculo.interf.AreaCalculavel;

public class Quadrado implements AreaCalculavel {

    private int lado;
    private int area;


    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void calcularArea(){
        area = lado * lado;
        System.out.println("A área do Quadrado é: " + area);
    }

}
