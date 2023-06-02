package br.com.poo.avaliacao.produto;

public class Teclado extends Produto {
    private String tipoConexao;
    private int qtdeTeclas;


    public Teclado(String nome, double preco, String descricao, int quantidade, String tipoConexao, int qtdeTeclas) {
        super(nome, preco, descricao, quantidade);
        this.tipoConexao = tipoConexao;
        this.qtdeTeclas = qtdeTeclas;
    }

    @Override
    public String obterDados() {
        return super.obterDados() + " / "
                + this.tipoConexao + " / "
                + this.qtdeTeclas;
    }
}
