package br.com.estoque.gerenciamento.view;

import br.com.estoque.gerenciamento.controller.GerenciadorController;
import br.com.estoque.gerenciamento.model.bean.Produtos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class GerenciadorMovimentacoesView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtNome, txtDescricao, txtId, txtQuantidade, txtPrecoCompra, txtPrecoVenda, txtIdCategoria;
    private JButton btnSalvar, btnLimpar, btnDeletar, btnListar, btnVoltar;
    private JTable tabela, tabelaProdutosAbaixoDe15;
    private DefaultTableModel modelo, modeloAbaixoDe15;
    private GerenciadorController controller;

    public GerenciadorMovimentacoesView(GerenciadorController controller) {
        this.controller = controller;

        setTitle("Gerenciamento de Movimentações");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Painel de formulário
        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(null);
        painelFormulario.setBounds(10, 10, 670, 200);

        // ID
        JLabel lblId = new JLabel("*ID:");
        lblId.setBounds(10, 10, 80, 25);
        painelFormulario.add(lblId);

        txtId = new JTextField();
        txtId.setBounds(100, 10, 200, 25);
        txtId.setEditable(false);
        painelFormulario.add(txtId);

        // Nome
        JLabel lblNome = new JLabel("*Nome:");
        lblNome.setBounds(10, 50, 80, 25);
        painelFormulario.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 50, 200, 25);
        txtNome.setEditable(false);
        painelFormulario.add(txtNome);

        // Descrição
        JLabel lblDescricao = new JLabel("*Descrição:");
        lblDescricao.setBounds(10, 90, 80, 25);
        painelFormulario.add(lblDescricao);

        txtDescricao = new JTextField();
        txtDescricao.setBounds(100, 90, 200, 25);
        txtDescricao.setEditable(false);
        painelFormulario.add(txtDescricao);

        // Quantidade
        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(10, 130, 80, 25);
        painelFormulario.add(lblQuantidade);

        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(100, 130, 200, 25);
        painelFormulario.add(txtQuantidade);

        // Preço Compra
        JLabel lblPrecoCompra = new JLabel("*Preço Compra:");
        lblPrecoCompra.setBounds(330, 50, 100, 25);
        painelFormulario.add(lblPrecoCompra);

        txtPrecoCompra = new JTextField();
        txtPrecoCompra.setBounds(430, 50, 200, 25);
        txtPrecoCompra.setEditable(false);
        painelFormulario.add(txtPrecoCompra);

        // Preço Venda
        JLabel lblPrecoVenda = new JLabel("*Preço Venda:");
        lblPrecoVenda.setBounds(330, 90, 100, 25);
        painelFormulario.add(lblPrecoVenda);

        txtPrecoVenda = new JTextField();
        txtPrecoVenda.setBounds(430, 90, 200, 25);
        txtPrecoVenda.setEditable(false);
        painelFormulario.add(txtPrecoVenda);

        // ID Categoria
        JLabel lblIdCategoria = new JLabel("*ID Categoria:");
        lblIdCategoria.setBounds(330, 130, 100, 25);
        painelFormulario.add(lblIdCategoria);

        txtIdCategoria = new JTextField();
        txtIdCategoria.setBounds(430, 130, 200, 25);
        txtIdCategoria.setEditable(false);
        painelFormulario.add(txtIdCategoria);

        // Botões
        btnSalvar = new JButton("Atualizar");
        btnSalvar.setBounds(10, 170, 100, 30);
        painelFormulario.add(btnSalvar);

        btnDeletar = new JButton("Deletar");
        btnDeletar.setBounds(140, 170, 100, 30);
        painelFormulario.add(btnDeletar);

        btnListar = new JButton("Listar");
        btnListar.setBounds(250, 170, 100, 30);
        painelFormulario.add(btnListar);

        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(360, 170, 100, 30);
        painelFormulario.add(btnLimpar);

        btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(470, 170, 100, 30);
        painelFormulario.add(btnVoltar);

        getContentPane().add(painelFormulario);

        // Tabela de dados principais
        modelo = new DefaultTableModel(new String[]{"ID", "Nome", "Descrição", "Quantidade", "Preço Compra", "Preço Venda", "ID Categoria"}, 0);
        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(10, 220, 765, 150);
        getContentPane().add(scrollPane);

        // Nova tabela para produtos com quantidade abaixo de 15
        modeloAbaixoDe15 = new DefaultTableModel(new String[]{"ID", "Nome", "Descrição", "Quantidade", "Preço Compra", "Preço Venda", "ID Categoria"}, 0);
        tabelaProdutosAbaixoDe15 = new JTable(modeloAbaixoDe15);
        JScrollPane scrollPaneAbaixoDe15 = new JScrollPane(tabelaProdutosAbaixoDe15);
        scrollPaneAbaixoDe15.setBounds(10, 380, 765, 150);
        getContentPane().add(scrollPaneAbaixoDe15);

        // Ações dos botões
        btnSalvar.addActionListener(e -> atualizarProduto());
        btnDeletar.addActionListener(e -> deletarProduto());
        btnListar.addActionListener(e -> listarProdutos());
        btnLimpar.addActionListener(e -> limparCampos());
        btnVoltar.addActionListener(e -> voltarTela());

        // Evento de clique na tabela
        tabela.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tabela.getSelectedRow();
                if (row != -1) {
                    txtId.setText(modelo.getValueAt(row, 0).toString());
                    txtNome.setText(modelo.getValueAt(row, 1).toString());
                    txtDescricao.setText(modelo.getValueAt(row, 2).toString());
                    txtQuantidade.setText(modelo.getValueAt(row, 3).toString());
                    txtPrecoCompra.setText(modelo.getValueAt(row, 4).toString());
                    txtPrecoVenda.setText(modelo.getValueAt(row, 5).toString());
                    txtIdCategoria.setText(modelo.getValueAt(row, 6).toString());
                }
            }
        });

        setLocationRelativeTo(null);
    }

    private void listarProdutos() {
        modelo.setRowCount(0);
        modeloAbaixoDe15.setRowCount(0);
        List<Produtos> produtos = controller.listarProdutos();
        for (Produtos produto : produtos) {
            // Adiciona na tabela principal
            modelo.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getQuantidade(),
                    produto.getPrecoCompra(),
                    produto.getPrecoVenda(),
                    produto.getIdCategoria()
            });

            // Verifica se a quantidade está abaixo de 15
            if (produto.getQuantidade() < 15) {
                modeloAbaixoDe15.addRow(new Object[]{
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

    private void atualizarProduto() {
        int id = txtId.getText().isEmpty() ? 0 : Integer.parseInt(txtId.getText());
        String nome = txtNome.getText();
        String descricao = txtDescricao.getText();
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        double precoCompra = Double.parseDouble(txtPrecoCompra.getText());
        double precoVenda = Double.parseDouble(txtPrecoVenda.getText());
        int idCategoria = Integer.parseInt(txtIdCategoria.getText());

        if (quantidade < 15) {
            JOptionPane.showMessageDialog(this, "A quantidade do produto está abaixo de 15!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }

        // Criando o produto com todos os parâmetros
        Produtos produto = new Produtos(id, nome, descricao, quantidade, precoCompra, precoVenda, idCategoria);

        // Chamada para o método de atualização no controller
        if (controller.atualizacao(produto)) {
            JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");
            listarProdutos();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar produto!");
        }
    }

    private void deletarProduto() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para deletar.");
            return;
        }

        int id = Integer.parseInt(txtId.getText());
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente deletar o produto?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            if (controller.deletarProdutos(id)) {
                JOptionPane.showMessageDialog(this, "Produto deletado com sucesso!");
                listarProdutos();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao deletar produto!");
            }
        }
    }

    private void voltarTela() {
        this.dispose();
        new TelaPrincipalView(this.controller).setVisible(true);
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        txtPrecoCompra.setText("");
        txtPrecoVenda.setText("");
        txtIdCategoria.setText("");
    }
}
