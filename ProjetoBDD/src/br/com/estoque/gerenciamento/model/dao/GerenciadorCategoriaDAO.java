package br.com.estoque.gerenciamento.model.dao;

import br.com.estoque.gerenciamento.conexao.Conexao;
import br.com.estoque.gerenciamento.model.bean.Categorias;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorCategoriaDAO {

    private Connection conexao;

    public GerenciadorCategoriaDAO(){
        this.conexao = Conexao.getConnection();
    }

    public boolean inserir(Categorias categorias) {
        String sql = "{CALL cadastrar_categoria(?, ?)}";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, categorias.getNome());
            stmt.setString(2, categorias.getDescricao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(Categorias categorias) {
        String sql = "UPTADE categorias SET nome = ?, descricao = ?, WHERE id_categoria = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, categorias.getNome());
            stmt.setString(2, categorias.getDescricao());
            stmt.setInt(3, categorias.getIdCategoria());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletar(int idCategoria) {
        String sql = "DELETE FROM categorias WHERE id_categoria = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idCategoria);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Categorias> listar() {
        List<Categorias> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categorias";
        try (Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Categorias categoria = new Categorias(rs.getInt("id_categoria"), rs.getString("nome"), rs.getString("descricao"));
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categorias;
    }

}
