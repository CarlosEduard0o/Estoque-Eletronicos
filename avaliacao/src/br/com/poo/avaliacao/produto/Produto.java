package br.com.poo.avaliacao.produto;

public class Produto {
    protected String nome;
    protected double preco;
    protected String descricao;
    protected int quantidade;


    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String obterDados(){
        return this.nome +
                " / " + this.preco +
                " / " + this.descricao +
                " / " + this.quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }
}
