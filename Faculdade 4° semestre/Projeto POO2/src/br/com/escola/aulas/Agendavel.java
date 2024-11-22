package br.com.escola.aulas;

//Interface para o agendamento e cancelamento das aulas
public interface Agendavel {
    void agendarAula(String horario);
    void cancelarAula(String horario);
}
