package br.com.estoque.gerenciamento.model.bean;

public class Produtos {

    private int idProduto;
    private String nome;
    private String descricao;
    private int quantidade;
    private double precoCompra;
    private double precoVenda;
    private int idCategoria;



    public Produtos(int idProduto, String nome, String descricao, int quantidade, double precoCompra, double precoVenda, int idCategoria) {
        this.idProduto = idProduto;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.idCategoria = idCategoria;
    }

    public Produtos(int id, int quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
