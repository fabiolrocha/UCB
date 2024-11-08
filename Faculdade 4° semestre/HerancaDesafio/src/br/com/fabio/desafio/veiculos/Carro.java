package br.com.fabio.desafio.veiculos;

public class Carro extends Veiculo{

    private int numeroDePortas;

    public Carro(String marca, String modelo, int data, int numeroDePortas) {
        super(marca, modelo, data);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
}
