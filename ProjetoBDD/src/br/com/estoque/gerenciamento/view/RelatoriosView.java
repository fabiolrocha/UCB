package br.com.estoque.gerenciamento.view;

import br.com.estoque.gerenciamento.controller.GerenciadorController;
import br.com.estoque.gerenciamento.model.bean.Categorias;
import br.com.estoque.gerenciamento.model.bean.Produtos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class RelatoriosView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JButton btnListar, btnVoltar;
    private JTable tabelaCategorias, tabelaProdutos, tabelaBaixoEstoque, tabelaLucros;
    private DefaultTableModel modeloCategorias, modeloProdutos, modeloBaixoEstoque, modeloLucros;
    private GerenciadorController controller;

    public RelatoriosView(GerenciadorController controller) {
        this.controller = controller;

        setTitle("Relatórios");
        setSize(800, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Painel de botões na parte superior
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelBotoes.setBounds(10, 10, 765, 50);
        getContentPane().add(painelBotoes);

        // Botões
        btnListar = new JButton("Listar");
        painelBotoes.add(btnListar);

        btnVoltar = new JButton("Voltar");
        painelBotoes.add(btnVoltar);

        // Tabela de Categorias
        JLabel lblCategorias = new JLabel("Categorias Cadastradas:");
        lblCategorias.setBounds(10, 70, 300, 25);
        getContentPane().add(lblCategorias);

        modeloCategorias = new DefaultTableModel(new String[]{"ID", "Nome", "Descrição"}, 0);
        tabelaCategorias = new JTable(modeloCategorias);
        JScrollPane scrollPaneCategorias = new JScrollPane(tabelaCategorias);
        scrollPaneCategorias.setBounds(10, 100, 765, 150);
        getContentPane().add(scrollPaneCategorias);

        // Tabela de Produtos
        JLabel lblProdutos = new JLabel("Produtos Cadastrados:");
        lblProdutos.setBounds(10, 270, 300, 25);
        getContentPane().add(lblProdutos);

        modeloProdutos = new DefaultTableModel(new String[]{"ID", "Nome", "Descrição", "Quantidade", "Preço Compra", "Preço Venda", "ID Categoria"}, 0);
        tabelaProdutos = new JTable(modeloProdutos);
        JScrollPane scrollPaneProdutos = new JScrollPane(tabelaProdutos);
        scrollPaneProdutos.setBounds(10, 300, 765, 150);
        getContentPane().add(scrollPaneProdutos);

        // Tabela de Produtos com Baixo Estoque
        JLabel lblBaixoEstoque = new JLabel("Produtos com Estoque Baixo:");
        lblBaixoEstoque.setBounds(10, 470, 300, 25);
        getContentPane().add(lblBaixoEstoque);

        modeloBaixoEstoque = new DefaultTableModel(new String[]{"ID", "Nome", "Descrição", "Quantidade", "Preço Compra", "Preço Venda", "ID Categoria"}, 0);
        tabelaBaixoEstoque = new JTable(modeloBaixoEstoque);
        JScrollPane scrollPaneBaixoEstoque = new JScrollPane(tabelaBaixoEstoque);
        scrollPaneBaixoEstoque.setBounds(10, 500, 765, 150);
        getContentPane().add(scrollPaneBaixoEstoque);

        // Tabela de Lucros (Preço Venda - Preço Compra)
        JLabel lblLucros = new JLabel("Lucro de Produtos:");
        lblLucros.setBounds(10, 670, 300, 25);
        getContentPane().add(lblLucros);

        modeloLucros = new DefaultTableModel(new String[]{"ID", "Nome", "Lucro"}, 0);
        tabelaLucros = new JTable(modeloLucros);
        JScrollPane scrollPaneLucros = new JScrollPane(tabelaLucros);
        scrollPaneLucros.setBounds(10, 700, 765, 150);
        getContentPane().add(scrollPaneLucros);

        // Ações dos botões
        btnListar.addActionListener(e -> listarRelatorios());
        btnVoltar.addActionListener(e -> voltarTela());

        setLocationRelativeTo(null);
    }

    // Método para listar todos os relatórios nas 4 tabelas
    private void listarRelatorios() {
        listarCategorias();
        listarProdutos();
        listarBaixoEstoque();
        listarLucros();
    }

    // Listar Categorias
    private void listarCategorias() {
        modeloCategorias.setRowCount(0);
        List<Categorias> categorias = controller.listarCategorias();
        for (Categorias categoria : categorias) {
            modeloCategorias.addRow(new Object[]{
                    categoria.getIdCategoria(),
                    categoria.getNome(),
                    categoria.getDescricao()
            });
        }
    }

    // Listar Produtos
    private void listarProdutos() {
        modeloProdutos.setRowCount(0);
        List<Produtos> produtos = controller.listarProdutos();
        for (Produtos produto : produtos) {
            modeloProdutos.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getQuantidade(),
                    produto.getPrecoCompra(),
                    produto.getPrecoVenda(),
                    produto.getIdCategoria()
            });
        }
    }

    // Listar Produtos com Baixo Estoque (quantidade abaixo de 15, por exemplo)
    private void listarBaixoEstoque() {
        modeloBaixoEstoque.setRowCount(0);
        List<Produtos> produtos = controller.listarProdutos();
        for (Produtos produto : produtos) {
            if (produto.getQuantidade() < 15) {
                modeloBaixoEstoque.addRow(new Object[]{
                        produto.getIdProduto(),
                        produto.getNome(),
                        produto.getDescricao(),
                        produto.getQuantidade(),
                        produto.getPrecoCompra(),
                        produto.getPrecoVenda(),
                        produto.getIdCategoria()
                });
            }
        }
    }

    // Listar Lucros (Preço de Venda - Preço de Compra)
    private void listarLucros() {
        modeloLucros.setRowCount(0);
        List<Produtos> produtos = controller.listarProdutos();
        for (Produtos produto : produtos) {
            double lucro = produto.getPrecoVenda() - produto.getPrecoCompra();
            modeloLucros.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    lucro
            });
        }
    }

    // Método para voltar para a tela principal
    private void voltarTela() {
        this.dispose();
        new TelaPrincipalView(this.controller).setVisible(true);
    }
}
