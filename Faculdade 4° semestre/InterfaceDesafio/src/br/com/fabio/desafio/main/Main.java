package br.com.fabio.desafio.main;

import br.com.fabio.desafio.formas.impl.Quadrado;
import br.com.fabio.desafio.formas.impl.Retangulo;
import br.com.fabio.desafio.formas.impl.Triangulo;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Áreas calculáveis =====");

        Triangulo objTriangulo = new Triangulo(25, 10);
        objTriangulo.calcularArea();

        Quadrado objQuadrado = new Quadrado(20);
        objQuadrado.calcularArea();

        Retangulo objRetangulo = new Retangulo(20, 40);
        objRetangulo.calcularArea();
    }
}