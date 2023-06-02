package br.com.poo.avaliacao.produto;

public class Computador extends Produto {
    private String modelo;
    private int qtdeRam;
    private int qtdeArmazenamento;

    public Computador(String nome, double preco, String descricao, int quantidade, String modelo, int qtdeRam, int qtdeArmazenamento) {
        super(nome, preco, descricao, quantidade);
        this.modelo = modelo;
        this.qtdeRam = qtdeRam;
        this.qtdeArmazenamento = qtdeArmazenamento;
    }

    @Override
    public String obterDados() {
        return super.obterDados() + " / "
                + this.modelo + " / "
                + this.qtdeRam + " / "
                + this.qtdeArmazenamento;
    }
}
