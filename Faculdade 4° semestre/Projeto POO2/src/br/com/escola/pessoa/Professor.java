package br.com.escola.pessoa;

import br.com.escola.aulas.*;

//Classe professor, onde temos qual curso ele dá aula e quais aulas ele possui
public class Professor extends Pessoa implements Agendavel {
    public Professor(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }

    @Override
    public void agendarAula(String horario) {
        System.out.println("Aula agendada para " + horario);
    }

    @Override
    public void cancelarAula(String horario) {
        System.out.println("Aula de " + horario + " foi cancelada.");
    }
}
