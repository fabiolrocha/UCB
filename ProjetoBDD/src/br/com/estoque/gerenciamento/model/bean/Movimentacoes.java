package br.com.estoque.gerenciamento.model.bean;

public class Movimentacoes {

    private int idMovimentacao;
    private int idProduto;
    private String tipoMovimentacao;
    private int quantidade;
    private int dataMovimento;

    public Movimentacoes(int idMovimentacao, int idProduto, String tipoMovimentacao, int quantidade, int dataMovimento) {
        this.idMovimentacao = idMovimentacao;
        this.idProduto = idProduto;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.dataMovimento = dataMovimento;
    }

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public int getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(int dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
