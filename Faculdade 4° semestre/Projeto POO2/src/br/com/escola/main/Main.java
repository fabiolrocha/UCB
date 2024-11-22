//Grupo: Caio Fellipe, Cayky Emilio, Fábio Luiz, Isabella Cardoso
package br.com.escola.main;


import br.com.escola.pessoa.*;
import br.com.escola.aulas.*;
import br.com.escola.observer.*;
import br.com.escola.curso.*;

public class Main {
    public static void main(String[] args) {
        // Criando alunos e professores
        Aluno aluno1 = new Aluno("Fabio Luiz", 20, "Taguatinga, TaguaLife");
        Aluno aluno2 = new Aluno("Caio Fellipe", 19, "Aguas Claras, Cris Village ");
        Professor professor1 = new Professor("Cayky Emilio", 40, "Ceilandia, Chaparral");
        Professor professor2 = new Professor("Fernando Junior", 35, "Guara, Q 21");

        // Gerenciador de aulas (Singleton)
        GerenciadorDeAulas gerenciador = GerenciadorDeAulas.getInstance();

        // Adicionando aulas
        System.out.println("\n--- Horários de aulas disponíveis ---");
        gerenciador.adicionarAula("Quarta-Feira, 10h - Aula de Piano");
        gerenciador.adicionarAula("Quinta-Feira, 15h - Aula de Violão");

        System.out.println("====================================");

        // Professores agendam aulas
        professor1.agendarAula("Quarta-feira, 10h - Aula de Piano");
        professor2.agendarAula("Quinta-feira, 15h - Aula de Violão ");

        System.out.println("====================================");

        // Cancelando uma aula
        professor1.cancelarAula("Quarta-feira, 14h - Aula de Piano");

        System.out.println("====================================");

        // Criando cursos com Factory
        Curso cursoPiano = CursoFactory.criarCurso("piano");
        Curso cursoViolao = CursoFactory.criarCurso("violao");

        // Inscrições de alunos em cursos
        aluno1.inscreverCurso("Piano");
        aluno2.inscreverCurso("Violão");

        System.out.println("====================================");

        // Cancelando inscrição de um aluno
        aluno1.cancelarInscricao("Piano");

        System.out.println("====================================");

        System.out.println("--- Descrição dos cursos ---");
        cursoPiano.descricao();
        cursoViolao.descricao();

        System.out.println("====================================");

        // Testando Observer
        Notificador notificador = new Notificador();

        AlunoObservador observadorAluno1 = new AlunoObservador(aluno1.getNome(), "violao");
        AlunoObservador observadorAluno2 = new AlunoObservador(aluno2.getNome(), "piano");

        notificador.adicionarObservador(observadorAluno1);
        notificador.adicionarObservador(observadorAluno2);

        System.out.println("--- Enviando notificações específicas ---");
        notificador.notificar("Aula de Violão foi reagendada para Sexta-feira, 17h.", "violao");
        notificador.notificar("Curso de Piano terá um evento especial no próximo sábado.", "piano");

        System.out.println("====================================");

        // Removendo um observador
        notificador.removerObservador(observadorAluno1);
        notificador.notificar("Aula de Piano foi cancelada.", "piano");

        // Listando aulas restantes
        gerenciador.removerAula("Segunda-feira, 10h - Aula de Piano");

        System.out.println("====================================");

        System.out.println("--- Horários de aulas após remoções ---");
        for (String horario : gerenciador.getHorarios()) {
            System.out.println(horario);
        }
    }
}

