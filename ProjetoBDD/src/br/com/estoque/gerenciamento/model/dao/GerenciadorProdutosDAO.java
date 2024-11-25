package br.com.estoque.gerenciamento.model.dao;

import br.com.estoque.gerenciamento.conexao.Conexao;
import br.com.estoque.gerenciamento.model.bean.Produtos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutosDAO {

    private Connection conexao;

    public GerenciadorProdutosDAO() {
        this.conexao = Conexao.getConnection();
    }

    public boolean inserir(Produtos produtos) {
        String sql = "{CALL cadastrar_produto(?, ?, ?, ?, ?, ?)}";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produtos.getNome());
            stmt.setString(2, produtos.getDescricao());
            stmt.setInt(3, produtos.getQuantidade());
            stmt.setDouble(4, produtos.getPrecoCompra());
            stmt.setDouble(5, produtos.getPrecoVenda());
            stmt.setInt(6, produtos.getIdCategoria());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(Produtos produtos) {
        String sql = "UPTADE categorias SET nome = ?, descricao = ?, quantidade = ?, preco_compra = ?, preco_venda = ?, id_categoria = ?, WHERE id_produto = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produtos.getNome());
            stmt.setString(2, produtos.getDescricao());
            stmt.setInt(3, produtos.getQuantidade());
            stmt.setDouble(4, produtos.getPrecoCompra());
            stmt.setDouble(5, produtos.getPrecoVenda());
            stmt.setInt(6, produtos.getIdCategoria());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletar(int idProduto) {
        String sql = "DELETE FROM produtos WHERE id_produto = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idProduto);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Produtos> listar() {
        List<Produtos> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produtos produto = new Produtos(rs.getInt("id_produto"), rs.getString("nome"), rs.getString("descricao"), rs.getInt("quantidade"), rs.getInt("preco_compra"), rs.getInt("preco_venda"), rs.getInt("id_categoria"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public boolean categoriaExiste(int idCategoria) {
        String sql = "SELECT COUNT(*) FROM categorias WHERE id_categoria = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idCategoria);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean atualizarProduto(Produtos produto) {
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, quantidade = ?, preco_compra = ?, preco_venda = ?, id_categoria = ? WHERE id_produto = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setDouble(4, produto.getPrecoCompra());
            stmt.setDouble(5, produto.getPrecoVenda());
            stmt.setInt(6, produto.getIdCategoria());
            stmt.setInt(7, produto.getIdProduto());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


}



