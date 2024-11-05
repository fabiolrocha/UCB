package br.com.fabio.desafio.veiculos;

public class Moto extends Veiculo{

    private String modeloEscapamento;

    public Moto(String marca, String modelo, int data, String modeloEscapamento) {
        super(marca, modelo, data);
        this.modeloEscapamento = modeloEscapamento;
    }

    public String getModeloEscapamento() {
        return modeloEscapamento;
    }

    public void setModeloEscapamento(String modeloEscapamento) {
        this.modeloEscapamento = modeloEscapamento;
    }
}
