package br.com.estoque.gerenciamento.controller;

import br.com.estoque.gerenciamento.model.bean.Categorias;
import br.com.estoque.gerenciamento.model.bean.Produtos;
import br.com.estoque.gerenciamento.model.dao.GerenciadorCategoriaDAO;
import br.com.estoque.gerenciamento.model.dao.GerenciadorProdutosDAO;
import java.util.List;


public class GerenciadorController {
        private GerenciadorProdutosDAO daoProdutos;
        private GerenciadorCategoriaDAO daoCategorias;

        public GerenciadorController() {
            this.daoProdutos = new GerenciadorProdutosDAO();
            this.daoCategorias = new GerenciadorCategoriaDAO();
        }

        public boolean salvar(Produtos produto) {
            return produto.getIdProduto() == 0 ? daoProdutos.inserir(produto) : daoProdutos.atualizar(produto);
        }

        public boolean salvar(Categorias categoria) {
            return categoria.getIdCategoria() == 0 ? daoCategorias.inserir(categoria) : daoCategorias.atualizar(categoria);
        }

        public boolean atualizacao(Produtos produto) {
            return daoProdutos.atualizarProduto(produto);
        }

        public boolean deletarProdutos(int id) {
            return daoProdutos.deletar(id);
        }

        public boolean deletarCategorias(int id) {
            return daoCategorias.deletar(id);
        }

        public List<Produtos> listarProdutos() {
            return daoProdutos.listar();
        }

        public List<Categorias> listarCategorias() {
            return daoCategorias.listar();
        }

    public boolean categoriaExiste(int idCategoria){
            return daoProdutos.categoriaExiste(idCategoria);
    }


    }


