package br.com.estoque.main;

import br.com.estoque.gerenciamento.controller.GerenciadorController;
import br.com.estoque.gerenciamento.view.TelaPrincipalView;

public class Main {
    public static void main(String[] args) {

        GerenciadorController controller = new GerenciadorController();

        TelaPrincipalView telaPrincipal = new TelaPrincipalView(controller);

        telaPrincipal.setVisible(true);
    }
}


