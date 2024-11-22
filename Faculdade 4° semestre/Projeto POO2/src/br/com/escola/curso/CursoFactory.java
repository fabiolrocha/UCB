package br.com.escola.curso;

//O factory para criação do curso e definição dele
public class CursoFactory {
    public static Curso criarCurso(String tipo) {
        switch (tipo.toLowerCase()) {
            case "piano":
                return new CursoDePiano();
            case "violao":
                return new CursoDeViolao();
            default:
                throw new IllegalArgumentException("Tipo de curso inválido.");
        }
    }
}
