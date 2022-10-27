/******************************/
package sisrestaurante;


import java.util.*;
import java.util.LinkedList;
import java.util.LinkedHashSet;

import static sisrestaurante.Pedido.calcularValorTotal;
import static sisrestaurante.Pedido.realizarPagamento;
/******************************/

/**
 * <h1>WasabiApp</h1>
 * Esta classe faz o gerenciamento de pedidos de um restaurante;
 * <p>
 * @author José Anderson
 * @version 1.0
 * @since 15-10-2022
 * </p>
 */

/******************************/
public class WasabiAppIDAO implements IDAO
/******************************/
{

    /**
     * Exibe um resumo de um Pedido mostrando também os dados do Cliente
     * @param pedido
     * @param cliente
     */

    public static void exibirResumo(LinkedList<Produto> produtos, Cliente cliente, Pedido pedido){
        System.out.println("Cliente: "+cliente.getNome());
        System.out.println("Endereço: "+cliente.getEndereco());
        for (Produto produto: produtos) {
            System.out.println(produto.getNome()+" R$"+produto.getPreco());
        }
        System.out.println("Taxa de entrega: R$"+pedido.getTaxaEntrega());
        System.out.println("Valor total: R$"+pedido.calcularValorTotal(produtos));

    }

    public static void faturamentoRestaurante(){
        System.out.println("**********************************");
        System.out.println("FATURAMENTO TOTAL DO RESTAURANTE: R$" + faturamentoTotal);
    }


    static Map<Cliente, Pedido> pagamento = new HashMap<>();

    static float faturamentoTotal = 0;

    public static void main(String[] args) {


        // Criando os  produtos do cardápio, dois produtos para cada Classe
        Entrada entrada1 = new Entrada("Unha de caranguejo", 12, 1, "Unha de caranguejo deliciosa", "Imagina uma Unha de caranguejo");
        entrada1.gravarProduto(entrada1);

        Entrada entrada2 = new Entrada("Bolinho de Bacalhau", 20, 2, "Bolinho de Bacalhau deliciosa", "Imagina uma Bolinho de Bacalhau");
        entrada2.gravarProduto(entrada2);

        TemakiEspecial temaki1 = new TemakiEspecial("Temaki de atum", 60, 3, "Temaki de atum deliciosa", "Imagina uma Temaki de atum");
        temaki1.gravarProduto(temaki1);

        TemakiEspecial temaki2 = new TemakiEspecial("Temaki de mortadela", 30, 3, "Temaki de mortadela deliciosa", "Imagina uma Temaki de mortadela");
        temaki2.gravarProduto(temaki2);

        Promocao promocao1 = new Promocao("Bife de ovo", 25, 5, "Bife de ovo delicioso", "Imagina uma Bife de ovo");
        promocao1.gravarProduto(promocao1);

        Promocao promocao2 = new Promocao("Salada de salsicha", 20, 6, "Salada de salsicha deliciosa", "Imagina uma Salada de salsicha");
        promocao2.gravarProduto(promocao2);

        HollWassabi hollwassabi1 = new HollWassabi("Hotholl camarão", 80, 7, "Hotholl camarão deliciosa", "Imagina uma Hotholl camarão");
        hollwassabi1.gravarProduto(hollwassabi1);

        HollWassabi hollwassabi2 = new HollWassabi("Hotholl frango", 60, 8, "Hotholl frango deliciosa", "Imagina uma Hotholl frango");
        hollwassabi2.gravarProduto(hollwassabi2);


        // Criando lista de produtos do pedido
        LinkedList<Produto> listaProdutoPrimerioCliente = new LinkedList<>();

        listaProdutoPrimerioCliente.add(entrada1);
        listaProdutoPrimerioCliente.add(entrada2);
        listaProdutoPrimerioCliente.add(promocao1);
        Pedido pedidoPrimeiroCliente = new Pedido(listaProdutoPrimerioCliente, 10f, "Sem cebola", calcularValorTotal(listaProdutoPrimerioCliente));
        pedidoPrimeiroCliente.gravarPedido(pedidoPrimeiroCliente);


        //Adicionando informações do cliente
        Cartao cartaoCliente1 = new Cartao("293824729", 100f);
        Cliente cliente1 = new Cliente("José Anderson", "8347598345", "043982034", "Rua dos Viajantes, 92", cartaoCliente1);
        cliente1.gravarCliente(cliente1);


        // Hora de pagar
        pagamento.putIfAbsent(cliente1, pedidoPrimeiroCliente); // adiciona no HashMap o cliente e seu pedido


        realizarPagamento(pagamento, cartaoCliente1, listaProdutoPrimerioCliente, cliente1, pedidoPrimeiroCliente);


        // Cliente quer fazer o mesmo pedido mas não tem saldo

        realizarPagamento(pagamento, cartaoCliente1, listaProdutoPrimerioCliente, cliente1, pedidoPrimeiroCliente);


        // Cliente refaz o pedido sem um dos itens
        pedidoPrimeiroCliente.removerItem(promocao1);
        pedidoPrimeiroCliente.gravarPedido(pedidoPrimeiroCliente);
        realizarPagamento(pagamento, cartaoCliente1, listaProdutoPrimerioCliente, cliente1, pedidoPrimeiroCliente);


        // Fauramento total do restaurante
        faturamentoRestaurante();


    }


}