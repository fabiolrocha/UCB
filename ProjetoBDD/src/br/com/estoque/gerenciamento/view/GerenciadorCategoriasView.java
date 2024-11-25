package br.com.estoque.gerenciamento.view;

import br.com.estoque.gerenciamento.controller.GerenciadorController;
import br.com.estoque.gerenciamento.model.bean.Categorias;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class GerenciadorCategoriasView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtId, txtNome, txtDescricao;
    private JButton btnSalvar, btnLimpar, btnDeletar, btnListar, btnVoltar;
    private JTable tabela;
    private DefaultTableModel modelo;
    private GerenciadorController controller;

    public GerenciadorCategoriasView(GerenciadorController controller) {
        this.controller = controller;

        setTitle("Gerenciamento de Categorias");
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
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 50, 80, 25);
        painelFormulario.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 50, 200, 25);
        painelFormulario.add(txtNome);

        // Descrição
        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(10, 90, 80, 25);
        painelFormulario.add(lblDescricao);

        txtDescricao = new JTextField();
        txtDescricao.setBounds(100, 90, 200, 25);
        painelFormulario.add(txtDescricao);

        // Botões
        btnSalvar = new JButton("Salvar");
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

        // Tabela de dados
        modelo = new DefaultTableModel(new String[]{"ID", "Nome", "Descrição"}, 0);
        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(10, 220, 765, 325);
        getContentPane().add(scrollPane);

        // Ações dos botões
        btnSalvar.addActionListener(e -> salvarCategoria());
        btnDeletar.addActionListener(e -> deletarCategoria());
        btnListar.addActionListener(e -> listarCategorias());
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
                }
            }
        });

        setLocationRelativeTo(null);
    }

    private void salvarCategoria(){
        int id = txtId.getText().isEmpty() ? 0 : Integer.parseInt(txtId.getText());
        String nome = txtNome.getText();
        String descricao = txtDescricao.getText();

        Categorias categoria = new Categorias(id, nome, descricao);

        if (controller.salvar(categoria)) {
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");
            listarCategorias();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar produto!");
        }

    }

    private void deletarCategoria() {
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para deletar.");
            return;
        }

        int id = Integer.parseInt(txtId.getText());
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente deletar o produto?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            if (controller.deletarCategorias(id)) {
                JOptionPane.showMessageDialog(this, "Produto deletado com sucesso!");
                listarCategorias();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao deletar produto!");
            }
        }
    }

    private void listarCategorias() {
        modelo.setRowCount(0);
        List<Categorias> categorias= controller.listarCategorias();
        for (Categorias categoria : categorias) {
            modelo.addRow(new Object[]{categoria.getIdCategoria(), categoria.getNome(), categoria.getDescricao()});
        }
    }
    private void voltarTela(){
        this.dispose(); // Fecha a tela atual
        new TelaPrincipalView(this.controller).setVisible(true);
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
    }

}



