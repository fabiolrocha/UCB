package br.com.fabio.desafio.main;
import br.com.fabio.desafio.veiculos.*;


public class Main {
    public static void main(String[] args) {

        Carro objCarro = new Carro("Volkswagem", "Gol", 1990, 2);
        System.out.println("======== Carro ========");
        System.out.println("Marca: " + objCarro.getMarca());
        System.out.println("Modelo: " + objCarro.getModelo());
        System.out.println("Ano: " + objCarro.getData());
        System.out.println("Quantidade de portas: " + objCarro.getNumeroDePortas());
        System.out.println("");

        Moto objMoto = new Moto("Yamaha", "FZ25", 2024, "Escape esportivo");

        System.out.println("======== Moto ========");
        System.out.println("Marca: " + objMoto.getMarca());
        System.out.println("Modelo: " + objMoto.getModelo());
        System.out.println("Ano: " + objMoto.getData());
        System.out.println("Modelo do escapamento: " + objMoto.getModeloEscapamento());
        System.out.println("");

        Caminhao objCaminhao = new Caminhao("Volvo", "Volvo FH", 2024, 2000);

        System.out.println("======== Caminhão ========");
        System.out.println("Marca: " + objCaminhao.getMarca());
        System.out.println("Modelo: " + objCaminhao.getModelo());
        System.out.println("Ano: " + objCaminhao.getData());
        System.out.println("Capacidade de carga: " + objCaminhao.getCapacidadeDeCarga() + "KG");
        System.out.println("");



    }



}