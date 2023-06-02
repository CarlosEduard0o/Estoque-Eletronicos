package br.com.poo.avaliacao.estoque;

import br.com.poo.avaliacao.interfaceusuario.InterfaceUsuario;
import br.com.poo.avaliacao.produto.Computador;
import br.com.poo.avaliacao.produto.Produto;
import br.com.poo.avaliacao.produto.Teclado;

public class Estoque {
    private String nome;
    private int tamEstoque;
    private Produto[] produtos;
    public Estoque(String nome, int tamEstoque){
        this.nome = nome;
        this.produtos = new Produto[tamEstoque];
    }


    public String getNome() {
        return nome;
    }

    public void adicionarProduto(Produto produtos){
        for(int i = 0; i < this.produtos.length; i++){
            if(this.produtos[i] == null){
                this.produtos[i] = produtos;
                break;
            }
        }
    }
    public void listarProdutos(){
        InterfaceUsuario ui = new InterfaceUsuario();
        boolean estoqueVazio = true;
        for (Produto produto : this.produtos){
            if(produto!=null){
                ui.mostrarNaTela(produto.obterDados());
                estoqueVazio = false;
            }
        }
        if(estoqueVazio){
            ui.mostrarNaTela("Não há produtos no estoque!");
        }
    }
//    public String buscarProdutoPorNome(String nomeProduto) {
//        for (Produto produto : this.produtos) {
//            if (produto.getNome().equals(nomeProduto)) {
//                return produto.obterDados();
//            }
//        }
//        return "Não há nenhum produto cadastrado com este nome";
//    }
    public Produto buscarProdutoPorNome(String nomeProduto) {
        InterfaceUsuario ui = new InterfaceUsuario();
        for (Produto produto : this.produtos) {
            try {
                if (produto.getNome().equals(nomeProduto)) {
                    return produto;
                }
            } catch (NullPointerException e) {
                break;
            }
        }
        return null;
    }
    public void mostrarNaTelaPorNome(Produto produto){
        if (produto == null){
            System.out.println("Não há nenhum produto cadastrado com este nome.");
        } else {
            System.out.println(produto.obterDados());
        }
    }
    public double calcularValorEmEstoque(){
        double valor = 0;
        for (Produto produto : this.produtos){
            if(produto != null){
                valor+= produto.getQuantidade()*produto.getPreco();
            }
        }
        return valor;
    }
}
