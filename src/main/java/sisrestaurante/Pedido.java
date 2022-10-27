package sisrestaurante;

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

    public Pedido(LinkedList<Produto> produtos, float taxaEntrega, String descricao, float valorTotal) {
        this.produtos = produtos;
        this.taxaEntrega = taxaEntrega;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }


    // Getters and Setters


    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }

    // Methods
    public void adicionarItem(Produto produto){
        this.produtos.add(produto);
    }

    public void removerItem(Produto produto){
        this.produtos.remove(produto);
    }



    @Override
    public String toString() {
        return "Pedido{" +
                "produtos=" + produtos +
                ", taxaEntrega=" + taxaEntrega +
                ", descricao='" + descricao + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }


    public static float calcularValorTotal(LinkedList<Produto> produtos){
        float valorTotal = 0;
        for (Produto produto: produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;

    }

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

    @Override
    public void gravarPedido(Object pedido) {
        System.out.println("=================================");
        System.out.println("Pedido gravado no banco de dados");
        System.out.println(pedido);
    }
}
