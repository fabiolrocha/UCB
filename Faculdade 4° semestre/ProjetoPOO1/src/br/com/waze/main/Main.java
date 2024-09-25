package br.com.waze.main;
import br.com.waze.calculos.Viagem;
import br.com.waze.calculos.CustoViagem;

public class Main {

    //Projeto da matéria de POO - Programação Orientada a Objetos. 
    //Grupo: Fábio Luiz, Caio Fellipe, Cayky Emilio. 
    public static void main(String[] args) {

        //Instanciando a classe Viagem
        Viagem viagem = new Viagem("Brasília", "Maranhão", 1670, 20);
        //Impriminto do console as informações da viagem pessoal
        System.out.println("-------- Viagem pessoal --------");
        System.out.println("");
        System.out.println("Local de saída: " + viagem.getLocalSaida());
        System.out.println("Local de chegada: " + viagem.getLocalChegada());
        System.out.println("Distância: " + viagem.getDistancia() + " KM");
        System.out.println("Tempo: " + viagem.getTempo() + " Hora(s)");
        System.out.println("Velocidade média: " + viagem.calcularVelocidadeMedia() + " KM/H");

        System.out.println("");
        System.out.println("=============================================");
        System.out.println("");

        //Instanciando a classe CustoViagem
        CustoViagem custoViagem = new CustoViagem("São Paulo", "Rio de Janeiro", 400, 4, 1.18);
        //Impriminto do console as informações da viagem de uber
        System.out.println("-------- Viagem de uber --------");
        System.out.println("");
        System.out.println("Local de saída: " + custoViagem.getLocalSaida());
        System.out.println("Local de chegada: " + custoViagem.getLocalChegada());
        System.out.println("Distância: " + custoViagem.getDistancia() + " KM");
        System.out.println("Tempo: " + custoViagem.getTempo() + " Hora(s)");
        System.out.println("Velocidade média: " + custoViagem.calcularVelocidadeMedia() + " KM/H");
        System.out.println("Valor do Km: R$ " + custoViagem.getMediaValorKM());
        System.out.println("Custo da viagem: R$ " + custoViagem.calcularCustoViagem());

        

        

        
    }
}
