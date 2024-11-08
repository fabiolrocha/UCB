package br.com.fabio.desafio.formas.impl;

import br.com.fabio.desafio.calculo.interf.AreaCalculavel;

public class Retangulo implements AreaCalculavel {

    private int base;
    private int altura;
    private int area;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        area = base * altura;
        System.out.println("A área do Retangulo é: " + area);
    }

}
