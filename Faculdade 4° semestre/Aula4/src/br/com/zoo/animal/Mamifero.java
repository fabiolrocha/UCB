package br.com.zoo.animal;

public class Mamifero extends Animal {

    private String tipoPelagem;
    private String gravidez;

    public Mamifero(String raca, String cor, int idade, String tipoPelagem, String gravidez){
        super(raca, cor, idade);
        this.tipoPelagem = tipoPelagem;
        this.gravidez = gravidez;
    }

    public void amamentar(){
        System.out.println("O " + raca + " de pelagem " + tipoPelagem + " está amamentando...");
    }

}
