/******************************/
package sisrestaurante;

/******************************/
/**
 * <h1>Pedido</h1>
 * Esta classe pode instanciar objeto do tipo Pedido para gerenciar as compras de um Cliente;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */
/****************************/

import java.awt.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import static sisrestaurante.WasabiAppIDAO.faturamentoTotal;

public class Pedido implements IDAO{
    private LinkedList<Produto> produtos;
    private float taxaEntrega;
    private String descricao;

    private float valorTotal;

    // Constructors

    /**
     * Construtor da classe Pedido, cria uma pedido
     * @param produtos
     * @param taxaEntrega
     * @param descricao
     * @param valorTotal
     */
    public Pedido(LinkedList<Produto> produtos, float taxaEntrega, String descricao, float valorTotal) {
        this.produtos = produtos;
        this.taxaEntrega = taxaEntrega;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }


    // Getters and Setters

    /**
     * Retorna o valor d
     * @return
     */
    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    /**
     * Modifica o valor da taxa de entrega do Pedido
     * @param taxaEntrega
     */
    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    /**
     * Retorna o valor da descrição
     * @return
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Modifica o valor da descrição do Pedido
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Retorna o valor da lista de produtos
     * @return
     */
    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Modifica os valores da lista de produtos
     * @param produtos
     */
    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }

    // Methods

    /**
     * Adiciona um novo item na lista de Produtos
     * @param produto produto a ser inserido
     */
    public void adicionarItem(Produto produto){
        this.produtos.add(produto);
    }

    /**
     * Remove um item da lista de produtos
     * @param produto produtoa ser removido
     */
    public void removerItem(Produto produto){
        this.produtos.remove(produto);
    }


    /**
     * Faz o retorno adequado dos nomes do atributos do Pedido
     * @return
     */
    @Override
    public String toString() {
        return "Pedido{" +
                "produtos=" + produtos +
                ", taxaEntrega=" + taxaEntrega +
                ", descricao='" + descricao + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }

    /**
     * Calcula o valor total de um pedido
     * @param produtos lista de produtos onde serão somados os valores de cada um
     * @return
     */
    public static float calcularValorTotal(LinkedList<Produto> produtos){
        float valorTotal = 0;
        for (Produto produto: produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;

    }

    /**
     * Realiza o pagamento do Pedido
     * @param pagamento guarda o pedido e o cliente responsável
     * @param cartao cartao que vai pagar a compra
     * @param produtos lista de produtos que o cliente escolheu
     * @param cliente cliente que vai pagar o Pedido
     * @param pedido Pedido contendo a lista de produtos e o valor total
     */
    public static void realizarPagamento(Map<Cliente, Pedido> pagamento, Cartao cartao, LinkedList<Produto> produtos, Cliente cliente, Pedido pedido){
        System.out.println("=====================================");
        if (cartao.getLimiteCartao() >= calcularValorTotal(produtos)) {
            System.out.println("Seu limite de cartão R$" + cartao.getLimiteCartao());
            WasabiAppIDAO.exibirResumo(produtos, cliente, pedido);
            cartao.setLimiteCartao(cartao.getLimiteCartao()-calcularValorTotal(produtos));
            System.out.println("Compra realizada com sucesso!!");
            System.out.println("Seu novo limite é: R$" + cartao.getLimiteCartao());
            faturamentoTotal += calcularValorTotal(produtos);

        }else{
            System.out.println("Você não tem saldo para essa compra");
            System.out.println("Seu limite: R$"+cartao.getLimiteCartao());
        }
        System.out.println("=====================================");

    }

    /**
     * Grava o pedido no banco de dados
     * @param pedido
     */
    @Override
    public void gravarPedido(Object pedido) {
        System.out.println("=================================");
        System.out.println("Pedido gravado no banco de dados");
        System.out.println(pedido);
    }
}
