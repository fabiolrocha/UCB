package br.com.waze.calculos;

public class Viagem {
    
    //Atributos
    private String localSaida;
    private String localChegada;
    private double distancia;
    private double tempo;

    //Construtor
    public Viagem (String localSaida, String localChegada, double distancia, double tempo){
        this.localSaida = localSaida;
        this.localChegada = localChegada;
        this.distancia = distancia;
        this.tempo = tempo;
    }

    //Getters e Setters do local de saida
    public String getLocalSaida(){
        return localSaida;
    }

    public void setlocalSaida(){
        this.localSaida = localSaida;
    }

    //Getters e Setters do local de chegada
    public String getLocalChegada(){
        return localChegada;
    }

    public void setLocalChegada(){
        this.localChegada = localChegada;
    }

    //Getters e Setters da distancia]
    public double getDistancia(){
        return distancia;
    }

    public void setDistancia(){
        this.distancia = distancia;
    }

    //Getters e Setters do tempo
    public double getTempo(){
        return tempo;
    }

    public void setTempo(){
        this.tempo = tempo;
    }

    //Método para calcular a velocidade média
    public double calcularVelocidadeMedia(){
        return distancia/tempo;
    }


}
