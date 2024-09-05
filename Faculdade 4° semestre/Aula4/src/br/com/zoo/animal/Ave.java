package br.com.zoo.animal;

public class Ave extends Animal {

    private String tipoPena;
    private String formatoBico;

    public Ave(String raca, String cor, int idade, String tipoPena, String formatoBico) {
        super(raca, cor, idade);
        this.tipoPena = tipoPena;
        this.formatoBico = formatoBico;
    }

    public void voar() {
        System.out.println("O " + raca + " está usando as penas " + tipoPena + " para voar...");
    } 

}
