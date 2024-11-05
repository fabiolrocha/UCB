package br.com.fabio.desafio.veiculos;

public class Veiculo {

   private String marca;
   private String modelo;
   private int data;

    public Veiculo(String marca, String modelo, int data) {
        this.marca = marca;
        this.modelo = modelo;
        this.data = data;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
