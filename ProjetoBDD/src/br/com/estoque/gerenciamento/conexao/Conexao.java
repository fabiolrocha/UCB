package br.com.estoque.gerenciamento.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/GerenciadorEstoque?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Rochafabio12!";

    private static Connection Conexao;


    private Conexao(){
        //Previnir a criação de instancias.
    };

    //Usado para criar a conexão com o banco de dados.
    public static Connection getConnection() {
        if (Conexao == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao conectar ao banco de dados", e);
            }
        }
        return Conexao;
    }


    //Usado para fechar a conexão com o banco de dados.
    public static void closeConnection() {
        if (Conexao != null) {
            try {
                Conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
