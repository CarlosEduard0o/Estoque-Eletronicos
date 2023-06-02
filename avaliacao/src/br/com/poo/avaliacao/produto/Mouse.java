package br.com.poo.avaliacao.produto;

public class Mouse extends Produto {
    private String tipo;
    private int qtdeDpi;


    public Mouse(String nome, double preco, String descricao, int quantidade, String tipoMouse, int qtdeDpi) {
        super(nome, preco, descricao, quantidade);
        this.tipo = tipoMouse;
        this.qtdeDpi = qtdeDpi;
    }

    @Override
    public String obterDados() {
        return super.obterDados() + " / "
                + this.tipo + " / "
                + this.qtdeDpi;
    }
}
