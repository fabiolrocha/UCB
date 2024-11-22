package br.com.escola.aulas;

import java.util.ArrayList;
import java.util.List;

//Classe do gerenciador de aulas
public class GerenciadorDeAulas {
    private static GerenciadorDeAulas instancia;
    private List<String> horarios;

    private GerenciadorDeAulas() {
        horarios = new ArrayList<>();
    }

    //Uso do Singleton
    public static GerenciadorDeAulas getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorDeAulas();
        }
        return instancia;
    }


    //Adesão e remoção dos horarios de aulas
    public void adicionarAula(String horario) {
        horarios.add(horario);
        System.out.println("Aula adicionada no horário: " + horario);
    }

    public void removerAula(String horario) {
        horarios.remove(horario);
        System.out.println("Aula removida do horário: " + horario);
    }

    public List<String> getHorarios() {
        return horarios;
    }
}

