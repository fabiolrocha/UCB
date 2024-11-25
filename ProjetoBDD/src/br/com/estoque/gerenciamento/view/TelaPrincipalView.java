package br.com.estoque.gerenciamento.view;

import br.com.estoque.gerenciamento.controller.GerenciadorController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaPrincipalView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTable tabela;
    private DefaultTableModel modelo;
    private GerenciadorController controller;

    public TelaPrincipalView(GerenciadorController controller) {
        this.controller = controller;

        // Configuração da janela
        setTitle("Tela Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout da tela principal
        getContentPane().setLayout(new BorderLayout());

        // Painel de botões de navegação
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        getContentPane().add(painelBotoes, BorderLayout.CENTER);

        // Botão para ir para a tela de gerenciamento de produtos
        JButton btnGerenciarProdutos = new JButton("Gerenciar Produtos");
        btnGerenciarProdutos.addActionListener(e -> {
            new GerenciadorProdutosView(controller).setVisible(true);
            this.setVisible(false);
        });
        painelBotoes.add(btnGerenciarProdutos);

        // Botão para ir para a tela de gerenciamento de categorias
        JButton btnGerenciarCategorias = new JButton("Gerenciar Categorias");
        btnGerenciarCategorias.addActionListener(e -> {
            new GerenciadorCategoriasView(controller).setVisible(true);
            this.setVisible(false);
        });
        painelBotoes.add(btnGerenciarCategorias);

       
        // Botão para ir para a tela de gerenciamento de movimentações
        JButton btnGerenciarMovimentacoes = new JButton("Gerenciar Movimentações");
        btnGerenciarMovimentacoes.addActionListener(e -> {
            new GerenciadorMovimentacoesView(controller).setVisible(true);
            this.setVisible(false);
        });
        painelBotoes.add(btnGerenciarMovimentacoes);

        // Botão para ir para a tela de gerenciamento de movimentações
        JButton btnRelatoriosView = new JButton("Relatorios");
        btnRelatoriosView.addActionListener(e -> {
            new RelatoriosView(controller).setVisible(true);
            this.setVisible(false);
        });
        painelBotoes.add(btnRelatoriosView);
        
        }
    }
