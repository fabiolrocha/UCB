package br.com.waze.calculos;

public class CustoViagem extends Viagem {
    
    //Atributo
    private double mediaValorKM;

    //Construtor
    public CustoViagem(String localSaida, String localChegada, double distancia, double tempo, double mediaValorKM){
        super(localSaida, localChegada, distancia, tempo);
        this.mediaValorKM = mediaValorKM;
    }

    //Getters e Setters do valor da corrida
    public double getMediaValorKM(){
        return mediaValorKM;
    }

    public void setMediaValorKM(){
        this.mediaValorKM = mediaValorKM;
    }

    //Método para calcular o custo da viagem
    public double calcularCustoViagem(){
            return (getDistancia() * getMediaValorKM()) + (getTempo() * 11.4);
    }

}
