package br.com.escola.observer;

import java.util.ArrayList;
import java.util.List;

//Um observer que utiliza os dados e avisos do AlunoObservador
public class Notificador {
    private List<AlunoObservador> observadores = new ArrayList<>();

    public void adicionarObservador(AlunoObservador observador) {
        observadores.add(observador);
    }

    public void removerObservador(AlunoObservador observador) {
        observadores.remove(observador);
    }

    public void notificar(String mensagem, String tipoDeInteresse) {
        for (AlunoObservador o : observadores) {
            if (o.getInteresse().equalsIgnoreCase(tipoDeInteresse)) {
                o.atualizar(mensagem);
            }
        }
    }
}

