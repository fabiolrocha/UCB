package br.com.fabio.desafio.veiculos;

public class Caminhao extends Veiculo{

    private int capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int data, int capacidadeDeCarga) {
        super(marca, modelo, data);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}
