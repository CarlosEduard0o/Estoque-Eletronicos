package br.com.poo.avaliacao.main;

import br.com.poo.avaliacao.estoque.Estoque;
import br.com.poo.avaliacao.interfaceusuario.InterfaceUsuario;
import br.com.poo.avaliacao.produto.Computador;
import br.com.poo.avaliacao.produto.Mouse;
import br.com.poo.avaliacao.produto.Produto;
import br.com.poo.avaliacao.produto.Teclado;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario ui = new InterfaceUsuario();
        ui.mostrarNaTela("Entre com o nome do estoque");
        String nomeEstoque = ui.lerDados().nextLine();
        ui.mostrarNaTela("Entre com a capacidade do estoque");
        int tamEstoque = ui.lerDados().nextInt();
        ui.lerDados().nextLine();
        Estoque estoque = new Estoque(nomeEstoque, tamEstoque);
        int opcao = -1;
        do {
            ui.mostrarNaTela("" +
                    "\nControle de Estoque [" + estoque.getNome() + "]" +
                    "\n=== Opções ===" +
                    "\n1- Cadastrar Computador" +
                    "\n2- Cadastrar Teclado" +
                    "\n3- Cadastrar Mouse" +
                    "\n4- Listar Produtos" +
                    "\n5- Buscar Produto por Nome" +
                    "\n6- Calcular Valor em Estoque" +
                    "\n0- Sair do Sistema");
            opcao = ui.lerDados().nextInt();

            switch (opcao) {
                case 1:
                    ui.mostrarNaTela("Nome do computador: ");
                    String nomeComputador = ui.lerDados().next();
                    ui.mostrarNaTela("Preço do computador: ");
                    double precoComputador = ui.lerDados().nextDouble();
                    ui.lerDados().nextLine();
                    ui.mostrarNaTela("Dercrição do computador: ");
                    String descricaoComputador = ui.lerDados().next();
                    ui.mostrarNaTela("Quantidade: ");
                    int quantidadeComputadores = ui.lerDados().nextInt();
                    ui.lerDados().nextLine();
                    ui.mostrarNaTela("Modelo do computador: ");
                    String modeloComputador = ui.lerDados().next();
                    ui.mostrarNaTela("Quantidade de RAM: ");
                    int qtdeRam = ui.lerDados().nextInt();
                    ui.lerDados().nextLine();
                    ui.mostrarNaTela("Quantidade de armazenamento: ");
                    int qtdeArmazenamento = ui.lerDados().nextInt();
                    Computador computador = new Computador(nomeComputador, precoComputador, descricaoComputador, quantidadeComputadores, modeloComputador, qtdeRam, qtdeArmazenamento);
                    estoque.adicionarProduto(computador);
                    break;
                case 2:
                    ui.mostrarNaTela("Nome do teclado: ");
                    String nomeTeclado = ui.lerDados().next();
                    ui.mostrarNaTela("Preço do teclado: ");
                    double precoTeclado = ui.lerDados().nextDouble();
                    ui.lerDados().nextLine();
                    ui.mostrarNaTela("Dercrição do teclado: ");
                    String descricaoTeclado = ui.lerDados().nextLine();
                    ui.mostrarNaTela("Quantidade: ");
                    int quantidadeTeclados = ui.lerDados().nextInt();
                    ui.lerDados().nextLine();
                    ui.mostrarNaTela("Tipo de conexão: ");
                    String tipoConexao = ui.lerDados().nextLine();
                    ui.mostrarNaTela("Quantidade de teclas: ");
                    int qtdeTeclas = ui.lerDados().nextInt();
                    ui.lerDados().nextLine();
                    Teclado teclado = new Teclado(nomeTeclado, precoTeclado, descricaoTeclado, quantidadeTeclados,tipoConexao,qtdeTeclas );
                    estoque.adicionarProduto(teclado);
                    break;
                case 3:
                    ui.mostrarNaTela("Nome do mouse: ");
                    String nomeMouse = ui.lerDados().next();
                    ui.mostrarNaTela("Preço do mouse: ");
                    double precoMouse = ui.lerDados().nextDouble();
                    ui.lerDados().nextLine();
                    ui.mostrarNaTela("Dercrição do mouse: ");
                    String descricaoMouse = ui.lerDados().nextLine();
                    ui.mostrarNaTela("Quantidade: ");
                    int quantidadeMouse = ui.lerDados().nextInt();
                    ui.lerDados().nextLine();
                    ui.mostrarNaTela("Tipo de mouse: ");
                    String tipoMouse = ui.lerDados().nextLine();
                    ui.mostrarNaTela("Quantidade de dpi: ");
                    int qtdeDpi = ui.lerDados().nextInt();
                    ui.lerDados().nextLine();
                    Mouse mouse = new Mouse(nomeMouse, precoMouse, descricaoMouse, quantidadeMouse,tipoMouse,qtdeDpi );
                    estoque.adicionarProduto(mouse);
                    break;
                case 4:
                    estoque.listarProdutos();
                    break;
                case 5:
                    ui.mostrarNaTela("Digite o nome do produto: ");
                    String nomeProduto = ui.lerDados().next();
                    estoque.mostrarNaTelaPorNome(estoque.buscarProdutoPorNome(nomeProduto));
                    break;
                case 6:
                    ui.mostrarNaTela(Double.toString(estoque.calcularValorEmEstoque()));
                    break;
                case 0:
                    ui.mostrarNaTela("Saindo ..");
                    break;
                default:
                    ui.mostrarNaTela("Opção Inválida");
            }
        } while (opcao != 0);
    }
}
